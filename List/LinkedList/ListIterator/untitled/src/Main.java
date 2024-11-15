import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> li= new LinkedList<>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        li.add("five");

        ListIterator<String> litr= li.listIterator();

        while(litr.hasNext())
        {
            if(litr.next().equals("three"))
                litr.set("THREE");
        }
        System.out.println(li);
    }
}