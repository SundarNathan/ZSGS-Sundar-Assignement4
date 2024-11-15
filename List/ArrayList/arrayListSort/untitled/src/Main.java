import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r= new Random();

        List<Integer> li= new ArrayList<>();

        for(int i=0;i<10;i++)
            li.add(1+r.nextInt(100));

        Collections.sort(li);
        System.out.println(li);
    }
}