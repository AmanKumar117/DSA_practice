import java.awt.*;
import java.awt.event.*;
class Demo2 extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
TextField t1,t2,t3;
Label l1,l2,l3;
   Demo2()
     {
      setVisible(true);
      setSize(200,200);
      setBackground(Color.BLUE);
      b1=new Button("ADD");
      b2=new Button("Sub");
      b3=new Button("Multiply");
      b4=new Button("Close");
      l1=new Label("Enter first number");
      l2=new Label("Enter Second number");
      l3=new Label("Result");
      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(10);
      setLayout(new FlowLayout());
      add(l1); add(t1); add(l2); add(t2); add(b1);add(b2);add(b3);
      add(l3);add(t3);add(b4);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
    }
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
  {
   int x=Integer.parseInt(t1.getText());
   int y=Integer.parseInt(t2.getText());
   int z=x+y;
   t3.setText(" "+ z);
  }
if(ae.getSource()==b2)
  {
   int x=Integer.parseInt(t1.getText());
   int y=Integer.parseInt(t2.getText());
   int z=x-y;
   t3.setText(" "+ z);
  }
if(ae.getSource()==b3)
  {
   int x=Integer.parseInt(t1.getText());
   int y=Integer.parseInt(t2.getText());
   int z=x*y;
   t3.setText(" "+ z);
  }
if(ae.getSource()==b4)
{dispose();}
}
public static void main(String args[])
{  new Demo2();}
}