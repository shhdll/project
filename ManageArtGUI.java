import java.awt.*;
import javax.swing.*;

public class ManageArtGUI {
    private Museum museum;

    public ManageArtGUI(Museum museum) {
        this.museum = museum;

        // Frame setup
        JFrame frame = new JFrame("Manage Art");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 300);
        frame.getContentPane().setBackground(new Color(68, 64, 53));

        // Buttons
        JButton addButton = new JButton("Add Art");
        JButton removeButton = new JButton("Remove Art");
        JButton searchButton = new JButton("Search Art");

        Color bgColor = new Color(82, 80, 67);
        Color fgColor = new Color(245, 235, 224);
        Dimension buttonSize = new Dimension(200, 50);

        JButton[] buttons = { addButton, removeButton, searchButton };
        for (JButton button : buttons) {
            button.setBackground(bgColor);
            button.setForeground(fgColor);
            button.setMaximumSize(buttonSize);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
        }

        // Panel 
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBackground(new Color(68, 64, 53));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 0));

        buttonPanel.add(addButton);
        buttonPanel.add(Box.createVerticalStrut(20));
        buttonPanel.add(removeButton);
        buttonPanel.add(Box.createVerticalStrut(20));
        buttonPanel.add(searchButton);

        frame.setLayout(new BorderLayout());
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Button actions
        addButton.addActionListener(e -> openAddArtFrame());
        removeButton.addActionListener(e -> openRemoveArtFrame());
        searchButton.addActionListener(e -> openSearchArtFrame());

        frame.setVisible(true);
    }

    private void openAddArtFrame() {
        JFrame addFrame = new JFrame("Add Art");
        addFrame.setSize(500, 400);
        addFrame.setLayout(new GridBagLayout());
        addFrame.getContentPane().setBackground(new Color(68, 64, 53));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel idLabel = new JLabel("ID:");
        JTextField idField = new JTextField();
        JLabel dateLabel = new JLabel("Date:");
        JTextField dateField = new JTextField();
        JLabel artistLabel = new JLabel("Artist:");
        JTextField artistField = new JTextField();
        JLabel typeLabel = new JLabel("Type:");
        JTextField typeField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JButton addPaintingButton = new JButton("Add Painting");
        JButton addSculptureButton = new JButton("Add Sculpture");

        Color textColor = new Color(245, 235, 224);
        JLabel[] labels = { idLabel, dateLabel, artistLabel, typeLabel, nameLabel };
        for (JLabel label : labels) label.setForeground(textColor);

        JButton[] buttons = { addPaintingButton, addSculptureButton };
        for (JButton button : buttons) {
            button.setBackground(new Color(82, 80, 67));
            button.setForeground(textColor);
        }

        gbc.gridx = 0; gbc.gridy = 0; addFrame.add(idLabel, gbc);
        gbc.gridx = 1; addFrame.add(idField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; addFrame.add(dateLabel, gbc);
        gbc.gridx = 1; addFrame.add(dateField, gbc);
        gbc.gridx = 0; gbc.gridy = 2; addFrame.add(artistLabel, gbc);
        gbc.gridx = 1; addFrame.add(artistField, gbc);
        gbc.gridx = 0; gbc.gridy = 3; addFrame.add(typeLabel, gbc);
        gbc.gridx = 1; addFrame.add(typeField, gbc);
        gbc.gridx = 0; gbc.gridy = 4; addFrame.add(nameLabel, gbc);
        gbc.gridx = 1; addFrame.add(nameField, gbc);
        gbc.gridx = 0; gbc.gridy = 5; addFrame.add(addPaintingButton, gbc);
        gbc.gridx = 1; addFrame.add(addSculptureButton, gbc);

        addPaintingButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String date = dateField.getText();
                String artist = artistField.getText();
                String type = typeField.getText();
                String name = nameField.getText();
                Art painting = new Paintings(id, date, artist, type, name);
                museum.addArt(painting);
                JOptionPane.showMessageDialog(addFrame, "Painting added successfully!");
                addFrame.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(addFrame, "Error: " + ex.getMessage());
            }
        });

        addSculptureButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String date = dateField.getText();
                String artist = artistField.getText();
                String material = typeField.getText();
                String name = nameField.getText();
                Art sculpture = new Sculptures(id, date, artist, material, name);
                museum.addArt(sculpture);
                JOptionPane.showMessageDialog(addFrame, "Sculpture added successfully!");
                addFrame.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(addFrame, "Error: " + ex.getMessage());
            }
        });

        addFrame.setVisible(true);
    }

    private void openRemoveArtFrame() {
        JFrame removeFrame = new JFrame("Remove Art");
        removeFrame.setSize(400, 200);
        removeFrame.setLayout(new GridBagLayout());
        removeFrame.getContentPane().setBackground(new Color(68, 64, 53));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Enter Art Name:");
        JTextField nameField = new JTextField(15);
        JButton removeButton = new JButton("Remove");
        JLabel feedbackLabel = new JLabel("");

        Color textColor = new Color(245, 235, 224);
        nameLabel.setForeground(textColor);
        feedbackLabel.setForeground(textColor);
        removeButton.setBackground(new Color(82, 80, 67));
        removeButton.setForeground(textColor);

        gbc.gridx = 0; gbc.gridy = 0; removeFrame.add(nameLabel, gbc);
        gbc.gridx = 1; removeFrame.add(nameField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2; removeFrame.add(removeButton, gbc);
        gbc.gridy = 2; removeFrame.add(feedbackLabel, gbc);

        removeButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            Art artToRemove = museum.searchArt(name);
            if (artToRemove != null && museum.removeArt(artToRemove)) {
                feedbackLabel.setText("\u2705 Art removed successfully!");
            } else {
                feedbackLabel.setText("\u274C Art not found or could not be removed.");
            }
        });

        removeFrame.setVisible(true);
    }

    private void openSearchArtFrame() {
        JFrame searchFrame = new JFrame("Search Art");
        searchFrame.setSize(400, 250);
        searchFrame.setLayout(new GridBagLayout());
        searchFrame.getContentPane().setBackground(new Color(68, 64, 53));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Enter Art Name:");
        JTextField nameField = new JTextField(15);
        JButton searchButton = new JButton("Search");
        JTextArea resultArea = new JTextArea(4, 25);
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        Color textColor = new Color(245, 235, 224);
        nameLabel.setForeground(textColor);
        resultArea.setBackground(new Color(82, 80, 67));
        resultArea.setForeground(textColor);
        resultArea.setBorder(BorderFactory.createLineBorder(textColor));
        searchButton.setBackground(new Color(82, 80, 67));
        searchButton.setForeground(textColor);

        gbc.gridx = 0; gbc.gridy = 0; searchFrame.add(nameLabel, gbc);
        gbc.gridx = 1; searchFrame.add(nameField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2; searchFrame.add(searchButton, gbc);
        gbc.gridy = 2; searchFrame.add(scrollPane, gbc);

        searchButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            Art art = museum.searchArt(name);
            if (art != null) {
                resultArea.setText("\u2705 Art found:\n" + art.toString());
            } else {
                resultArea.setText("\u274C Art not found.");
            }
        });

        searchFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Museum museum = new Museum("Harmony Museum", 100, 50);
        SwingUtilities.invokeLater(() -> new ManageArtGUI(museum));
    }
}
