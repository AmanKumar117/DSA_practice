class A{
    private String name;
    public A(String name){
        name = this.name;
    }
    public void display() {
        System.out.println("-_-");
    }
}
interface Z{
    public void A();
}
class B extends A{  //single level inheritance              //
    public B(String name){                                  //
        super(name);                                        //
    }                                                       //
    public void display() {                                 //
        System.out.println("@-@");                        //
    }                                                       //
}                                                           //
class C extends B{                                          //=======> Multi level inheritance
    public C(String name){                                  //
        super(name);                                        //
    }                                                       //
    public void display() {                                 //
        System.out.println("-o-");                        //
    }                                                       //
}                                                           //
//hierarchical inheritance
class D extends A{
    public D(String name){
        super(name);
    }
}
//multiple inheritance using implements keyword
class E extends A implements Z{
    public E(){
        super(null);
    }
    public void A(){
    }

}
public class InheritanceTypes {
    public static void main(String args[]){
        A a = new B("abc");
        A b = new C("xyz");
        A c = new D("asd");
        a.display();
        b.display();
        c.display();
    }
}
