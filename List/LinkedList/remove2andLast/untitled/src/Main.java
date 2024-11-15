import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> li = new LinkedList<>();

        for(int i=1;i<11;i++)
            li.add(i);
        li.remove(2);
        li.removeLast();
        System.out.println(li);
    }
}