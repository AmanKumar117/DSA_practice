import java.awt.*;
import java.awt.event.*;
class employee_info extends Frame implements ActionListener{
    Button b1, b2, b3,b4;
    Label L1,L2, L3,L4,L5,L6,L7,L8;
    TextField t1,t2, t3,t4,t5,t6,t7,t8;
    employee_info()
    {
    setVisible(true);
    setSize(200,200);
    b1=new Button("Save");
    b2=new Button("Save");
    b3=new Button("Clear");
    b4=new Button("Close");
    L1=new Label("Enter name of the employee:");
    L2=new Label("Enter the employee ID:");
    L3=new Label("Enter Salary:");
    L4=new Label("Enter name of the employee:");
    L5=new Label("Enter the employee ID:");
    L6=new Label("Enter Salary:");
    L7=new Label("Details of Employee 1:");
    L8=new Label("Details of Employee 2:");
    t1=new TextField(20);
    t2=new TextField(20);
    t3=new TextField(20);
    t4=new TextField(20);
    t5=new TextField(20);
    t6=new TextField(20);
    t7=new TextField(60);
    t8=new TextField(60);
    setBackground(Color.YELLOW);
    setLayout(new FlowLayout());
    add(L1); add(t1); add(L2);add(t2);add(L3);add(t3);add(b1);
    add(L4); add(t4); add(L5);add(t5); add(L6);add(t6);add(b2); 
    add(L7);add(t7);
    add(L8);add(t8);add(b3);add(b4);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent obj)
    {
    if(obj.getSource()==b1){String a=t1.getText(); int b=Integer.parseInt(t2.getText()); int c=Integer.parseInt(t3.getText()); t7.setText(a+" ; "+Integer.toString(b)+" ; "+Integer.toString(c));}
    if(obj.getSource()==b2){String d=t4.getText(); int e=Integer.parseInt(t5.getText()); int f=Integer.parseInt(t6.getText()); t8.setText(d+" ; "+Integer.toString(e)+" ; "+Integer.toString(f));}
    if(obj.getSource()==b3){t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); t5.setText(""); t6.setText(""); t7.setText(""); t8.setText(""); }
    if(obj.getSource()==b4){dispose();}
    }
    public static void main(String args[])
    {
    new employee_info();
    
    }
    
}
    
