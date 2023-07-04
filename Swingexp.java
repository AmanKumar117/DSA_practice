import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class Swingexp {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Swing Use Example");
        JLabel t1 = new JLabel("Enter 2 values: ");
        Color mycolor = new Color(107, 106, 104);
        JTextField jd1 = new JTextField();
        JTextField jd2 = new JTextField();
        t1.setBounds(15, 30, 300, 20);
        jd1.setBounds(15, 50, 70, 20);
        jd2.setBounds(90, 50, 70, 20);
        final JTextField text1=new JTextField();
        text1.setBounds(15, 115, 150,20);
        JButton btn1=new JButton("+");
        btn1.setBounds(15,90,75,20);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String a , b;
                a = jd1.getText();
                b = jd2.getText();
                float a1 = Float.parseFloat(a);
                float b1 = Float.parseFloat(b);
                float value =a1 + b1;
                text1.setText(""+value);
            }
        });
        JButton btn2=new JButton("-");
        btn2.setBounds(95,90,75,20);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String a , b;
                a = jd1.getText();
                b = jd2.getText();
                float a1 = Float.parseFloat(a);
                float b1 = Float.parseFloat(b);
                float value =a1 - b1;
                text1.setText(""+value);
            }
        });
        JButton btn3=new JButton("*");
        btn3.setBounds(175,90,75,20);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String a , b;
                a = jd1.getText();
                b = jd2.getText();
                float a1 = Float.parseFloat(a);
                float b1 = Float.parseFloat(b);
                float value =a1 * b1;
                text1.setText(""+value);
            }
        });
        JButton btn4=new JButton("/");
        btn4.setBounds(255,90,75,20);
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String a , b;
                a = jd1.getText();
                b = jd2.getText();
                float a1 = Float.parseFloat(a);
                float b1 = Float.parseFloat(b);
                float value =a1 / b1;
                text1.setText(""+value);
            }
        });
        frame.add(t1);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(text1);
        frame.add(jd1);
        frame.add(jd2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(mycolor);
    }
}
