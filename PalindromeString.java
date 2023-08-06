import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int n = inp.length();
        boolean flag = true;
        for(int i = 0; i < n/2; i++){
            if(inp.charAt(i) != inp.charAt(n-1-i)){
                System.out.println("Not Palindrome");
                flag = false;
                break;
            }
            else{
                continue;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }
        sc.close();
    }
}
