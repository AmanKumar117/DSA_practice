import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class ConsoleInput{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Console co = System.console();
        String st1 = sc.nextLine();
        String st2 = br.readLine();
        String st3 = co.readLine();
        System.out.println(st1+" Input through Scanner ");
        System.out.println(st2+ " Input through BufferedReader");
        System.out.println(st3+ " Input through Console");
        sc.close();
        br.close();
        System.out.println(args[0] + " Input through cmd");//input using command line
    }
}