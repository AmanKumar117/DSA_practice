import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Fps extends JFrame implements ActionListener {
    private JButton easy, normal, hard;
    private JLabel target;
    private int numTargets = 0;
    private int targetDuration = 1000;
    private Timer timer;
    private Random random;
    private int score = 0;
    private boolean clicked = false;
    private Color myColor;
    public Fps() {
        super("Aim Practice");
        JOptionPane.showMessageDialog(null, "Welcome !!!\nThis is a simple Aim Practice game where the user has to click in the target as it appears randomly on the screen.\nINSTRUCTIONS:\nThe game has three difficulty levels: easy, normal and hard.\nUser can choose the dificulty level by clicking on the respective button.\nThe game starts with the target appearing on the screen and the user has to click on it to increase their score.\nThe target disappears once it is clicked and reappears at a random position on the screen. \nThe game ends after a 15 targets are displayed and the user's score is displayed.");
        myColor = new Color(170,201,206);
        easy = new JButton("Easy");
        normal = new JButton("Normal");
        hard = new JButton("Hard");
        easy.setBounds(10, 10, 90, 20);
        normal.setBounds(105, 10, 90, 20);
        hard.setBounds(200, 10, 90, 20);
        target = new JLabel();
        target.setVisible(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(easy);
        contentPane.add(normal);
        contentPane.add(hard);
        contentPane.add(target);
        contentPane.setBackground(myColor);
        target.setBounds(0, 0, 50, 50);
        easy.addActionListener(this);
        normal.addActionListener(this);
        hard.addActionListener(this);
        random = new Random();
        target.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!clicked) {
                    score++;
                    clicked = true;
                    target.setVisible(false);
                }
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == easy) {
            targetDuration = 1500;
        } else if (e.getSource() == normal) {
            targetDuration = 1000;
        } else if (e.getSource() == hard) {
            targetDuration = 500;
        }
        numTargets = 0;
        target.setVisible(false);
        timer = new Timer(targetDuration, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = random.nextInt(getWidth() - 50);
                int y = random.nextInt(getHeight() - 50);
                target.setBounds(x, y, 50, 50);
                target.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                target.setOpaque(true);
                target.setBackground(Color.BLACK);
                target.setVisible(true);
                clicked = false;
                numTargets++;
                if (numTargets > 15) {
                    timer.stop();
                    target.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Game Over!\nScore: " + score+"/15");
                    score = 0;
                }
            }
        });
        timer.start();
    }
    public static void main(String[] args) {
        new Fps();
    }
}