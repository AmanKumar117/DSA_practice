import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("The fibonacci series upto n numbers is: ");
        System.out.print(a + " " + b + " ");
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
        sc.close();
    }
}
