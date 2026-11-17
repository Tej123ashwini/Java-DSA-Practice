import java.util.Arrays;
import java.util.Stack;

public class nextgreaterelement {

    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 2, 10, 7};

        int n = arr.length;

        int[] res = new int[n];

        Arrays.fill(res, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() &&  arr[st.peek()] < arr[i]) {

                int index = st.pop();

                res[index] = arr[i];
            }

            st.push(i);
        }

        System.out.println(Arrays.toString(res));
    }
}

