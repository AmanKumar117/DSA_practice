//aggregation and composition
class Engine{
    public void work(){
        System.out.println("Engine of car has been started.");
    }
}
class Car{
    private Engine engine;//aggregation; engine is attribute here.
    Car(Engine engine){
        this.engine = engine;
    }
    Car(){
        System.out.println("Car without engine");
    }
    public void move(){
        if(engine != null){
            engine.work();
            System.out.println("Car is moving.");
        }
        else{
            System.out.println("Car is not moving");
        }
    }
}
public class Cars {
    public static void main(String[] args){
        Engine k = null;
        Engine g = new Engine();
        Car maruti = new Car(k);
        Car suzuki = new Car(g);
        maruti.move();
        suzuki.move();
        Car kia = new Car();
        kia.move();
    }
}
