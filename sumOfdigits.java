import java.util.Scanner;
public class sumOfdigits {
    public static void main(String[] args){
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        n1 = sc.nextInt();
        System.out.println("enter the second number:");
        n2 = sc.nextInt();
        System.out.println("Sum of both the numbers is"+ (n1+n2));
        sc.close();
    }
}
