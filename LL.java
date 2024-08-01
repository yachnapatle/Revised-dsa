public class LL {
    static int size=0;
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public  void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
         newnode.next=head;
    
        head=newnode;

    }
    public  void addlast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=newnode;
       
    }
    public void add(int data,int pos)
    {
        Node newnode=new Node(data);
        if(pos==0)
        {
            addfirst(data);
        }
        if(pos==size)
        {
         addlast(data);   
        }
        int i=0;
        Node temp=head;
        while(i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;

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
    public static void main(String[] args) {
        
LL list =new LL();
list.addfirst(1);
list.addfirst(2);
list.addfirst(3);
list.add(9, 2);
list.print();





    }
    
}


class LL1{
static int size=0;
Node head;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    public  void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
         newnode.next=head;
    
        head=newnode;

    }



}

}


