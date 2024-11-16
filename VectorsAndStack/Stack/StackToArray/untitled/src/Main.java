import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Double> st= new Stack<>();
        st.push(1.1);
        st.push(2.2);
        st.push(3.3);
        st.push(4.4);
        st.push(5.5);

        Double[] arr= st.toArray(new Double[0]);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        System.out.println(st);
    }
}