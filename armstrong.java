import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        int N, temp, sum = 0, rightDigit;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Integer");
        N = sc.nextInt();
        temp = N;
        while (temp != 0) {
            rightDigit = temp % 10;
            sum = sum + (rightDigit * rightDigit * rightDigit);
            temp = temp / 10;
        }
        if (sum == N) {
            // N is armstrong number
            System.out.format("%d is Armstrong Number", N);
        } else {
            // N is not an armstrong number
            System.out.format("%d is Not an Armstrong Number", N);
        }
        sc.close();
    }
}
