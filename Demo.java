import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
TextField a;
Demo()
{
setVisible(true);
setSize(200,200);
b1=new Button("RED");
b2=new Button("GREEN");
b3=new Button("BLUE");
b4=new Button("CLOSE");
a=new TextField(20);
setBackground(Color.YELLOW);
setLayout(new FlowLayout());
add(b1);add(b2);add(b3);add(b4);add(a);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent obj)
{
if(obj.getSource()==b1){setBackground(Color.RED);}
if(obj.getSource()==b2){setBackground(Color.GREEN);}
if(obj.getSource()==b3){setBackground(Color.BLUE);}
if(obj.getSource()==b4){dispose();}
}
public static void main(String args[])
{
new Demo();



}




}