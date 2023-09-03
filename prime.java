import java.util.Scanner;
public class prime {
      public static void main(String[] args) { 
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked:");
        num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
         // condition for nonprime number
          if (num % i == 0) {
            flag = true;
            break;
            }
        }
          if (!flag)
            System.out.println(num + " is a prime number.");
          else
            System.out.println(num + " is not a prime number.");
        
        sc.close();
    }
}
