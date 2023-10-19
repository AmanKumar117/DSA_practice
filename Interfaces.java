interface Animal{
    public static final String tname = "Blank"; // even if not mentioned static or final it'll remain final and static
    void speed();
    void name(String tname);
    default void show(){
        System.out.println("Default method of Animal");
    }
}
interface FastAnimal{
    void run(int a);
    default void show(){
        System.out.println("Default method of FastAnimal");
    }
    static void roar(){
        System.out.println("Static method of FastAnimal");
    }
}
class Tiger implements Animal, FastAnimal{
    int a;
    String y;
    public void speed(){
        System.out.println("fast animal");
    }
    public void name(String tname){
        this.y = tname;
        System.out.println("name is: "+ y);
    }
    public void run(int a){
        this.a = a;
        System.out.println("runs at: "+ a);
    }
    public void show(){
        Animal.super.show();
        FastAnimal.super.show();
    }
    void roar(){
        System.out.println("Tiger roar");
    }
}
public class Interfaces {
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.name("White");
        t.speed();
        t.run(5);
        t.show();
        FastAnimal.roar();
        t.roar();
    }
}
