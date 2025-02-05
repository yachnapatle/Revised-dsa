import java.util.LinkedList;

public class abc {
    static LinkedList<Integer> list = new LinkedList<>();

    public static void push(int data) {
        list.addFirst(data);
    }

    public static int peek() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.getFirst();
    }

    public static int pop() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.removeFirst();
    }

    public static boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        abc s = new abc();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

