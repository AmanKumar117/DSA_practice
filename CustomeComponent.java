import java.awt.*;
import java.io.Serializable;

import javax.swing.JComponent;
public class CustomeComponent extends JComponent implements Serializable { //(not serializable previously), but when it implements serializable class it becomes bean
    private int  x, y, width, height;
    private Color color;
    public CustomeComponent(){
        x = 0;
        y = 0;
        width = 50;
        height = 50;
        color = Color.RED;
    }
    //add setters and getters for X
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
        repaint();
    }
    //add setters and getters for Y
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
        repaint();
    }
    //add setters and getters for width
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
        repaint();
    }
    //add getters and setters for height
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
        repaint();
    }
    public Color getColor(){
        return color;
    }
    //setter for color
    public void setColor(Color color){
        this.color = color;
        repaint();
    }
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(width, height);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
