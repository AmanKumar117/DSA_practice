import javax.swing.*;
public class Bean1 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create object of CustomComponent
        CustomeComponent customeComponent = new CustomeComponent();
        //set all parameters according to requirment
        customeComponent.setX(60);
        customeComponent.setY(60);
        customeComponent.setWidth(200);
        customeComponent.setHeight(200);

        frame.add(customeComponent);
        frame.setVisible(true);
    }
}
