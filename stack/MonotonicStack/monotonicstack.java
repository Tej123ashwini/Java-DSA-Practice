import java.util.Scanner;
import java.util.Stack;

public class monotonicstack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        IO.println("Enter the nof elements: ");
        int n = sc.nextInt();

        IO.println("Enter the elements: ");

        for(int i=0;i<n;i++) {
            int data = sc.nextInt();
            while (!st.isEmpty() && st.peek() < data) {          // for increasing monotonic staxk st.peek() > data
                st.pop();
            }
            st.push(data);
        }
        IO.println("stack size: " + st.size());
        IO.println("stack contains: " + st);
    }
}