import java.util.*;
public class PermuComb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        int permu = fact(n)/fact(r);
        int comb = fact(n)/(fact(r) * fact(n-r));
        System.out.println("Permutation: "+permu + " Combination: "+ comb);
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}
