import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> color= new Vector<>(Arrays.asList("red", "green", "blue", "yellow"));

        System.out.println(Arrays.toString(color.toArray()));
        System.out.println(color);
    }
}