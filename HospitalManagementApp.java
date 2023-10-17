import java.awt.*;
import javax.swing.*;

public class HospitalManagementApp {

    public static void main(String[] args) {
        // Create a frame and set its layout to BorderLayout.
        JFrame frame = new JFrame("Hospital Management App");
        frame.setLayout(new BorderLayout());

        // Add components to the frame.
        frame.add(new JLabel("Patients"), BorderLayout.NORTH);

        // Create a grid layout for the center region.
        JPanel centerPanel = new JPanel(new GridLayout(2, 3));

        // Add components to the center panel.
        centerPanel.add(new JLabel("Name"));
        centerPanel.add(new JTextField());
        centerPanel.add(new JLabel("Age"));
        centerPanel.add(new JTextField());
        centerPanel.add(new JLabel("Sex"));
        centerPanel.add(new JComboBox(new String[]{"Male", "Female"}));

        // Add the center panel to the frame.
        frame.add(centerPanel, BorderLayout.CENTER);

        // Create a grid bag layout for the south region.
        JPanel southPanel = new JPanel(new GridBagLayout());

        // Add components to the south panel.
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        southPanel.add(new JButton("Add Patient"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        southPanel.add(new JButton("Remove Patient"), gbc);

        // Add the south panel to the frame.
        frame.add(southPanel, BorderLayout.SOUTH);

        // Display the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}