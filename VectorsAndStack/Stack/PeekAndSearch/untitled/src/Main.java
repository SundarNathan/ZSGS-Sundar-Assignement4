import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> st= new Stack<>();
        st.push("first");
        st.push("second");
        st.push("third");
        st.push("fourth");

        System.out.println(st.peek());
        System.out.println(st.search("second"));
    }
}