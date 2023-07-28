import java.util.*;  
public class mergeArray  
{  
public static void main(String[] args)   
{  
    int n1,n2;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements you want to store in 1st array: ");  
    n1=sc.nextInt();  
    int[] array1 = new int[n1];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n1; i++)  
    {     
    array1[i]=sc.nextInt();  
    }  
    System.out.print("Enter the number of elements you want to store in 2nd array: ");  
    n2=sc.nextInt();  
    int[] array2 = new int[n2];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n2; i++)  
    {     
    array2[i]=sc.nextInt();  
    }  

    int[] result = new int[n1 + n2];  //resultant array of size first array and second array  
    System.arraycopy(array1, 0, result, 0, n1);  
    System.arraycopy(array2, 0, result, n1, n2);
    System.out.println("the merged array is: ");  
    System.out.println(Arrays.toString(result));    //prints the resultant array 
    sc.close(); 
}  
}  