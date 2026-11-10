import java.util.*;

public class usingQueueInterface {
    
    public static void main(String[] args) {
        
        Queue<Integer> qu = new LinkedList<>();

        // checks if empty
        System.out.println(qu.isEmpty());

        // inserts the data using add and offer
        qu.offer(10);
        qu.add(20);
        qu.offer(30);

        System.err.println("Queue contains: " + qu);

        System.out.println(qu.isEmpty());

        // return the front data
        System.out.println(qu.peek());

        // removes and return the front data
        System.out.println( qu.poll());

        System.err.println("Queue contains: " + qu);

        // removes the front data
        System.out.println(qu.remove());
        System.err.println("Queue contains: " + qu);
    }
}
