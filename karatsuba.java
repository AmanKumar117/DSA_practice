import java.util.*;
public class karatsuba {
    //karatsuba function
    public static int karatsuba1(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (a < 10 && b < 10) {
            return a * b;
        }
        int n = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
        int m = n / 2;
        int a1 = a / (int) Math.pow(10, m);
        int a2 = a % (int) Math.pow(10, m);
        int b1 = b / (int) Math.pow(10, m);
        int b2 = b % (int) Math.pow(10, m);
        int z0 = karatsuba1(a1, b1);
        int z1 = karatsuba1((a1 + a2), (b1 + b2));
        int z2 = karatsuba1(a2, b2);
        int z3 = z1 - z0 - z2;
        int z4 = (int) Math.pow(10, 2 * m);
        return z0 * z4 + z3 * z4 + z2;
    }
    //multiplication of 2 numbers using karatsuba
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(karatsuba1(a, b));
        sc.close();
    }
    
}
