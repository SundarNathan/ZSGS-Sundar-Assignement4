import java.util.Stack;

public class Main {
    static String reverse(String s)
    {
        Stack<Character> st= new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
            st.push(s.charAt(i));

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        String s="hello";

        s=reverse(s);
        System.out.println(s);
    }
}