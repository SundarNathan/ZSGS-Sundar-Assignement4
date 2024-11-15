import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> li= new LinkedList<>();
        li.add(5);
        li.add(10);
        li.add(15);
        li.add(20);
        li.add(25);

        System.out.println(li.getFirst()+" "+li.getLast());
    }
}