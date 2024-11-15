import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> li= new LinkedList<>();

        li.add('A');
        li.add('B');
        li.add('C');
        li.add('D');
        li.add('E');

        Collections.reverse(li);

        System.out.println(li);
    }
}