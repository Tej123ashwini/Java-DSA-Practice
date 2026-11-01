import java.util.Stack;

public class operationsOfStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        boolean found = true;

        System.out.println("Using Collections : ");
        System.out.println();
        System.out.println(found + " -- it means stack is empty");

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("stack contains: " + st);

        System.out.println("deleted elemnet : " + st.pop());
        System.out.println("top element : " + st.peek());

        found = st.isEmpty();
        System.out.println(found + " -- it means stack is not empty");

    }
        
}
