
import java.util.Stack;

class removeAllAdjacents {

    public static String adjacentsDuplicates(String s) {

    StringBuilder result = new StringBuilder();
    Stack<Character> st = new Stack<>();

    for(int i = 0;i < s.length();i++) {
        char cur = s.charAt(i);

        if(st.isEmpty()) {
            st.push(cur);
        }
        else if(st.peek() == cur) {
            st.pop();
        }
        else {
            st.push(cur);
        }
    }
    for (char ch : st) {
        result.append(ch);
    }
    return result.toString();
}
    public static void main(String[] args) {

        String answer = removeAllAdjacents.adjacentsDuplicates("abbaca");

        System.out.println(answer);
    }
}
