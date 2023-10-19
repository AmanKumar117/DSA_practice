abstract class Vehical {          //abstract class with dinamic binding, run time overriding, polymorphism
    public abstract void brakes();
}
class Lmv extends Vehical {
    public void brakes(){       //method overriden
        System.out.println("Normal Brakes");
    }
}
class Hmv extends Vehical {
    public void brakes(){       //method overridden
        System.out.println("Disk Brakes");
    }
}
public class Vehicals {
    public static void main(String[] args){
        Vehical v1 = new Lmv();
        v1.brakes();
        v1 = new Hmv();
        v1.brakes();
    }
}
