import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.*;

public class CustomeComponent2 extends JFrame implements ActionListener, Serializable {
    private JLabel label, label2;
    private JTextField textField, textField2;
    private JButton btn;
    CustomeComponent2(){ //creating a custome gui form
        JFrame frame = new JFrame();
        label = new JLabel("Enter Your Name");
        label2 = new JLabel("Enter Your Age");
        textField = new JTextField(20);
        textField2 = new JTextField(20);
        btn = new JButton("Submit");
        //add all elements to the frame
        add(label);
        add(textField);
        add(label2);
        add(textField2);
        add(btn);
        setSize(500, 500);
        setLayout(new GridLayout(3,2));
        setVisible(true);
        pack();//this packs all the element to a confined space , no extra spaces required
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//set default close operation
        btn.addActionListener(this);// adding action listener to button
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(textField.getText());
    }
    //implement getters
    public String getName(){
        return textField.getText();
    }
    //implement setters
    public void setName(String name){
        this.textField.setText(name);
    }
}

