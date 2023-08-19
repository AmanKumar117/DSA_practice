import java.util.*;
public class subarray {
    public static void subarr(int[] arr, int n) {
        int count = 0; 
        int prod1 = 1;
        int prod2 = 1;
        for(int i=0;i<n;i++) {
            if(arr[i]==0){
                count++;
                int max = 0 , prod = 1;
                for (int i = 0; i < n; i++) {
            
                    if(arr[i] > 0) {
                        prod*=arr[i];
                    }
                    else(prod>max){
                    max = prod;
                    count--;
                    }
                }
            }
            if(count==0 && arr[i]<0){
                count++;
                int max = 0 , prod = 1;
                for (int i = 0; i < n; i++) {
            
                    if(arr[i] > 0) {
                        prod*=arr[i];
                    }
                    else(prod>max){
                    max = prod;
                    count--;
                    }
                }
            }
            if(count==0 && arr[i]>0){
                n=n/2;
                for(i=0; i<n/2; i++) {
                    prod1 = prod1*arr[i];
                }
                for(i=n/2; i<n; i++) {
                    prod2 = prod2*arr[i];
                }
                System.out.println(prod1>prod2?prod1:prod2);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subarr(arr,n);
        sc.close();
    }
}