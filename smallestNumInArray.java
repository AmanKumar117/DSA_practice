import java.util.*;
public class smallestNumInArray {
    public static int getSmallest(int[] a, int total){  
        int temp;  
        for (int i = 0; i < total; i++)   {  
                    for (int j = i + 1; j < total; j++){  
                        if (a[i] > a[j]){  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[0];  
        }  
        public static void main(String args[]){  
            int n;
            Scanner sc=new Scanner(System.in);  
            System.out.print("Enter the number of elements you want to store in 1st array: ");  
            n=sc.nextInt();  
            int[] array = new int[n];  
            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<n; i++){     
            array[i]=sc.nextInt();  
            }   
        System.out.println("Smallest number in the array is: "+getSmallest(array,n));  
        sc.close();  
        }
}
