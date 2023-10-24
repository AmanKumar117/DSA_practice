import javax.swing.*;

public class MyForm extends JFrame {
    public MyForm() {
        setTitle("My Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create an instance of MyComponent
        MyComponent myComponent = new MyComponent();
        // Add the MyComponent to the form
        add(myComponent);
        pack(); // Adjusts the size of the frame based on its components
    }
    public static void main(String[] args) {
                MyForm myForm = new MyForm();
                myForm.setVisible(true);
    }
}
