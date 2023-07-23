import java.util.*;
public class HcfAndLcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = 1;
        for(int i = 1; i <= Math.min(num1, num2); i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        int lcm = (num1 *num2)/ hcf;
        System.out.println("HCF: "+hcf+ " LCM: "+lcm);
        sc.close();
    }
}