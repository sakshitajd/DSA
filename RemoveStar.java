import java.util.Stack;

public class RemoveStar {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "example*string";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        String result = "";
        while (!st.isEmpty()) {
            result = st.pop() + result;
        }

        System.out.println(result);
    }
}

