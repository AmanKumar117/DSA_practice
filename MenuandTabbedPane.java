import javax.swing.*;
import java.awt.*;
public class MenuandTabbedPane extends JFrame {
    private JMenu menu, subMenu;
    private JMenuBar menuBar;
    private JMenuItem item1, item2, item3, item4;
    private JTabbedPane tabbedPane;
    private JPanel panel1, panel2;
    MenuandTabbedPane(){
        setTitle("Menu and Tabbed Pane");
        tabbedPane = new JTabbedPane();
        panel1 = new JPanel();
        panel2 = new JPanel();
        menuBar = new JMenuBar();
        menu = new JMenu("Main Menu");
        subMenu = new JMenu("SubMenu");
        item1 = new JMenuItem("Item 1");
        item2 = new JMenuItem("Item 2");
        item3 = new JMenuItem("Item 3");
        item4 = new JMenuItem("Item 4");
        subMenu.add(item4);
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(subMenu);
        menuBar.add(menu);
        tabbedPane.add("panel1", panel1);
        tabbedPane.add("panel2", panel2);
        tabbedPane.setSize(200, 200);
        add(tabbedPane);
        setJMenuBar(menuBar);
        //setLayout(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args){
        new MenuandTabbedPane();
    }
}
