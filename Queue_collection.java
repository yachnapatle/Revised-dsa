import java.util.*;
public class Queue_collection {
    public static void main(String[] args) {
        // Queue<Integer>q=new LinkedList<>();
// for long
        // or 
        Queue<Integer>q=new ArrayDeque<>();
        // for small
        // doubly
        // circular queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            // System.out.println(q.poll());
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
