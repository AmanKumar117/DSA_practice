import java.util.*;

interface Add{  
    int add(int a,int b);  
}
public class lambda_exp {
    public static void main(String[] args) {  
        int x, y;
        Scanner sc= new Scanner(System.in);
        Add ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));   
        Add ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));
        System.out.println("enter the values to be added:");
        x= sc.nextInt();
        y= sc.nextInt();
        Add ad=(a,b)->(a+b);
        System.out.println("addition of entered values is: " + ad.add(x,y));
        sc.close();
    }
}
  
  