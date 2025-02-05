import java.util.Scanner;

public class linklistpractice {

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
        if (head == null)
        {
head=newnode;
return;
        }
        newnode.next=head;
        head=newnode;
    }
public void addlast(int data)
{
Node newnode= new Node(data);
if (head==null) {
    head=newnode;
    return;
    
}

Node tail=head;
while (tail.next!=null) {
    tail=tail.next;

    
}
tail.next=newnode;
}
    public  void print()
    {
Node temp=head;
while(temp!=null)
{
    System.out.print(temp.data + "->");
    temp=temp.next;
}
System.out.println("null");
    }

void add(int data,int pos)
{
    Node newnode=new Node(data);
    int i=0;
    Node temp=head;
    while (i<pos-1) {
        temp=temp.next;
    
        
    }
    newnode.next=temp.next;
    temp.next=newnode;
}
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        linklistpractice obj= new linklistpractice();
        // obj.addfirst(12);
        // obj.addfirst(13);
        // obj.addlast(14);
        // obj.add(25, 1);
        obj.add(75, 0);
        obj.print();

    }

}
