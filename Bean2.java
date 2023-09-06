import javax.swing.*;
public class Bean2 {
    public static void main(String[] args){
        CustomeComponent2 customeComponent2 = new CustomeComponent2();
        JFrame frame = new JFrame("MyComponent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(customeComponent2);
        frame.pack();
        frame.setVisible(true);
        //customeComponent2.setName("blabla");
        String name = customeComponent2.getName();
        System.out.println("Name "+ name);
        customeComponent2.setVisible(true);
    }
}
