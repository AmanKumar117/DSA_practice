import java.util.*;
class binary_palindrome{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int binary[] = new int[40];    
        int index = 0;
        int decimal= sc.nextInt();    
        while(decimal > 0){    
          binary[index++] = decimal%2;    
          decimal = decimal/2;    
        }    
        for(int i = index-1;i >= 0;i--){    
          System.out.print(binary[i]);    
        } 
        sc.close();
      }
}