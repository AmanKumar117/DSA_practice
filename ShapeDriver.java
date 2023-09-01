import java.util.*;
class Shape {
    private String form;
    int area;
    Shape(String form){
        this.form = form;
    }
    public String getShape(){
        return form;
    }
    public void setArea(int area){
        this.area = area;
    }
    public int getArea(){
        return area;
    }
}
public class ShapeDriver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape(args[0]);
        System.out.println("Enter the area: ");
        int val = sc.nextInt();
        s.setArea(val);
        System.out.print(s.getShape()+" with area: "+s.getArea());
        sc.close();
    }
}
