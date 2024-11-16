import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Character> v= new Vector<>();
        v.add('A');
        v.add('B');
        v.add('C');
        v.add('D');
        v.add('E');
        v.add(2,'X');
        v.removeFirst();
        System.out.println(v);
    }
}