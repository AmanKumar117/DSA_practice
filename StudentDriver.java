import java.util.*;
class EnggStudent {
    private String branch;
    public void setBranch(String branch){
        this.branch = branch;
    }
    public void display(){
        System.out.println("Branch is: "+ branch);
    }
}
interface ArtsStudent {
}
class Student extends EnggStudent implements ArtsStudent {
    private String name;
    private String email;
    Book b;
    public void readData(String name, String email, String title, String author){
        b = new Book(title, author);
        this.name = name;
        this.email = email;
    }
    public void displayStudent(){
        System.out.println("Student name: "+name);
        System.out.println("Student Email: "+ email);
        System.out.println("Book details: "+b.title +", "+b.author);
    }
}
class Book {
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
        System.out.println("Book has been created.");
    }
    public void displayBook(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
    }
}
public class StudentDriver {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter student name and email: ");
        String name = sc.nextLine();
        String email = sc.nextLine();
        System.out.println("Enter Book title and author: ");
        String title = sc.nextLine();
        String author = sc.nextLine();
        s.readData(name, email, title, author);
        s.displayStudent();
        System.out.println("Enter Student Branch: ");
        String branch = sc.nextLine();
        s.setBranch(branch);
        s.display();
        sc.close();

    }
}
