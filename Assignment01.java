//Aman Kumar Singh
//Reg No.: 20BCE10105
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment01 extends JFrame implements ActionListener {
    private JLabel voltage, resistance, current;
    private JTextField voltext, restext, curtext;
    private JButton btn;
    private JPanel panel;

    Assignment01() {
        setTitle("Physics Calculator");
        panel = new JPanel();
        voltage = new JLabel("Voltage: ");
        resistance = new JLabel("Resistance: ");
        current = new JLabel("Current: ");
        voltext = new JTextField(20);
        restext = new JTextField(20);
        curtext = new JTextField(20);
        btn = new JButton("Submit");
        voltage.setBounds(10, 10, 80, 20);
        voltext.setBounds(90, 10, 140, 20);
        resistance.setBounds(10, 40, 80, 20);
        restext.setBounds(90, 40, 140, 20);
        current.setBounds(10, 70, 80, 20);
        curtext.setBounds(90, 70, 140, 20);
        btn.setBounds(240, 40, 100, 20);
        panel.setLayout(null);
        panel.add(voltage);
        panel.add(voltext);
        panel.add(resistance);
        panel.add(restext);
        panel.add(current);
        panel.add(curtext);
        panel.add(btn);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);
        add(panel);
        setVisible(true);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double x = 0, y = 0, z = 0;
        boolean voltageSet = false, resistanceSet = false, currentSet = false;
        try {
            x = Double.parseDouble(voltext.getText().trim());
            voltageSet = true;
        } catch (NumberFormatException ex) {}
        try {
            y = Double.parseDouble(restext.getText().trim());
            resistanceSet = true;
        } catch (NumberFormatException ex) {}
        try {
            z = Double.parseDouble(curtext.getText().trim());
            currentSet = true;
        } catch (NumberFormatException ex) {}
        if (e.getSource() == btn) {
            if (voltageSet && resistanceSet && !currentSet) {
                // Calculate current if voltage and resistance are given
                double calculatedCurrent = x / y;
                curtext.setText(Double.toString(calculatedCurrent));
            } else if (voltageSet && !resistanceSet && currentSet) {
                // Calculate resistance if voltage and current are given
                double calculatedResistance = x / z;
                restext.setText(Double.toString(calculatedResistance));
            } else if (!voltageSet && resistanceSet && currentSet) {
                // Calculate voltage if resistance and current are given
                double calculatedVoltage = y * z;
                voltext.setText(Double.toString(calculatedVoltage));
            } else if (voltageSet && resistanceSet && currentSet) {
                // Verify if the given current is valid
                double calculatedCurrent = x / y;
                if (z == calculatedCurrent) {
                    panel.setBackground(Color.GREEN);
                    JOptionPane.showMessageDialog(null, "Current is valid.");
                } else {
                    panel.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null, "Current is invalid.");
                }
            } else {
                // If not enough values are given, ask for one more value
                JOptionPane.showMessageDialog(null, "Add one more value.");
                }
                }
            }
    public static void main(String[] args){
        new Assignment01();
    }
}
