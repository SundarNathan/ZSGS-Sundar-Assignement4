import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> li= new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);

        Iterator<Integer> it= li.iterator();

        while(it.hasNext())
        {
            if(it.next()>30)
                it.remove();
        }
        System.out.println(li);
    }
}