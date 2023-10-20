import java.io.Serializable;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JavaBean1 implements Serializable {
    private String message;
    private int clickCount;
    private String text;
    public JavaBean1(){
        this.message = "Default message.";
        this.clickCount = 0;
        this.text = "";
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public int getClickCount(){
        return clickCount;
    }
    public void setClickCount(int clickCount){
        this.clickCount = clickCount;
    }
    public JButton createButton(){
        JButton button = new JButton("Click");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, message);
            }
        });
        button.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent m){
                clickCount++;
            }
        });
        return button;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public JTextField createTextField(){
        JTextField textField = new JTextField();
        textField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent f){
                textField.setText(text);
            }
            public void focusLost(FocusEvent f){
                text = textField.getText();
            }
        });
        return textField;
    }
}
