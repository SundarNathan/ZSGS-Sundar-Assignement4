import java.util.Stack;

public class Main {
    static boolean checkParenthisis(String s)
    {
        Stack<Character> st= new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push(s.charAt(i));
            else if(st.isEmpty()&&s.charAt(i)==')')
                return false;
            else
                st.pop();
        }



        if(st.isEmpty())
            return true;
        return false;
    }
    public static void main(String[] args) {

        String s="(())";

        System.out.println(checkParenthisis(s));
    }
}