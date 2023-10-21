import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaBeanApp {
    public static void main(String[] args){
        JavaBean1 b = new JavaBean1();
        JPanel panel = new JPanel();
        panel.add(b.createButton());
        panel.add(b.createTextField());
        JFrame frame = new JFrame("Java Bean App");
        b.setMessage("new message!");
        b.setText("new text");
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        System.out.println(b.getClickCount());
    }
}
