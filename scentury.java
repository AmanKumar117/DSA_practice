import java.util.*;
public class scentury {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[100];
        int k,j =0;
        int i = sc.nextInt();
        while(i>=0)
        {
            arr[j]=i;
            j++;
            i = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]>=100){
            k= arr[0];
        }
        else{
            k=0;
        }  
    
        System.out.println(k);
      }
}