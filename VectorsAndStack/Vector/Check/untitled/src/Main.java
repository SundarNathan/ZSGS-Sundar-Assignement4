import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Double> v= new Vector<>();

        Random r= new Random();

        System.out.println(v.size());
        for(int i=0;i<5;i++)
            v.add(r.nextDouble());


        System.out.println(v);
        for( double d: v)
        {
                if(Math.abs(d-10.5) <1e-9)
                System.out.println("10.5 is present");
        }
        System.out.println(v.size());


    }
}