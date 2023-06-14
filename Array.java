import java.util.*;
public class Array {
    public static void main(String[] args){
        int[] arr = {6,9,8,3,1,0,4};
        for(int i = 0; i < 7; i++){
            System.out.println(arr[i]);
        }
        int min = arr[0];
        int max = 0;
        for(int j = 0; j < 7; j++){
            if(arr[j] < min){
                min = arr[j];
            }
            if(arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("Max :"+ max);
        System.out.println("Min :"+ min);
        Arrays.sort(arr);
        int l = arr.length;
        System.out.println("length of array: "+ l);
    }
}
