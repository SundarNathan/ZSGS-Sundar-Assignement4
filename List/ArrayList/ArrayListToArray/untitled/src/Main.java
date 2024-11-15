import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> li= new ArrayList<>();
        li.add("apple");
        li.add("banana");
        li.add("cherry");

        String[] str= li.toArray(new String [0]);
        System.out.println(Arrays.toString(str));
    }
}