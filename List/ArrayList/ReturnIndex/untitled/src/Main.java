import java.util.ArrayList;
import java.util.List;

public class Main {

    static int find(List<Character> li, char c)
    {
        for(int i=0; i<li.size(); i++)
        {
            if(li.get(i)==c)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Character> li= new ArrayList<>();
        li.add('a');
        li.add('b');
        li.add('c');
        li.add('d');
        li.add('e');
        li.add('f');
        li.add('g');
        li.add('h');
        li.add('i');
        li.add('j');

        System.out.println(find(li, 'j'));
    }
}