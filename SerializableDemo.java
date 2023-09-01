import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Movies implements Serializable{//example of class as a bean only when there is a no argument constructor
    private String mn;
    private int rating;
    public Movies(){ // because of this constructor this class is an example of bean
        this.mn = "MOVIE1";
        this.rating = 10;
    }
    public Movies(String mn, int rating){
        this.mn = mn;
        this.rating = rating;
    }
    public String getmn(){
        return mn;
    }
    public int getrating(){
        return rating;
    }
}
public class SerializableDemo{
    public static void main(String[] args){
        try{
            Movies movie = new Movies("fav", 10);
            FileOutputStream fileOut = new FileOutputStream("Movies.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(movie);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in Movies.ser");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
