public class LL {
    static int size = 0;
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;

        head = newnode;

    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newnode;

    }

    public void add(int data, int pos) {
        Node newnode = new Node(data);
        if (pos == 0) {
            addfirst(data);
        }
        if (pos == size) {
            addlast(data);
        }
        int i = 0;
        Node temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    public void removefirst() {
        if (head == null) {
            System.out.println("list is empty");
        }
        head = head.next;
    }

    public void removelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;

    }

    public void remove(int pos) {
        if (pos == 0) {
            removefirst();
            return;
        }
        if (pos == size - 1) {
            removelast();
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < pos - 1) {

            temp = temp.next;
            i++;

        }
        Node x = temp.next;
        temp.next = temp.next.next;
        x.next = null;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LL list = new LL();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.add(9, 2);
        list.print();

        list.removefirst();
        list.print();
        list.removelast();
        list.print();
        list.remove(1);
        list.print();

    }

}
