import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> v= new Vector<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));

        Enumeration<String> en= v.elements();

        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }

        for(int i=0;i<v.size();i++)
        {
            if(v.get(i).equals("cherry"))
                v.set(i,"coconunt");
        }
        System.out.println(v);
    }
}