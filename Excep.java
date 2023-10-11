//import java.io.IOException;
import java.util.*;
public class Excep extends Exception {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println("Division is: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception "+e);
        }
        catch(InputMismatchException i){
            System.out.println("Input mismatch "+i);
        }
        finally{
            System.out.println("End of Exception handelling");
        }
        sc.close();
    }
}
