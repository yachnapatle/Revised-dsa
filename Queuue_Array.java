import java.util.*;
public class Queuue_Array {
    static class Queue{
        int n;
        int []arr;
        int front,rear;
        Queue (int size){
           this.n=size;
           this.arr=new int[size];
this.front=-1;
this.rear=-1;

        }
    
    public boolean isEmpty()
    {
        return rear==-1;
    }
    public boolean isFull()
    {
        return rear==(n-1);
    }
    public void add(int data)
    {
        if(isFull())
        {
            System.out.println("queue is full");
            return;
        }

        rear++;
        arr[rear]=data;
        // arr[++rear]=data;

// it is also known as nqueu
    }
    public int remove()
    {

        if(isEmpty())
        {
            System.out.println("khali hai");
            return -1;
        }
        int x=arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];

        }
        arr[rear]=0;
        rear--;
        return x;
    }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Queue obj=new Queue(6);
        // obj.add(7);
        // obj.add(9);
        // obj.add(10);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        System.out.println(obj.isEmpty());
        // System.out.println(obj.remove());
        while (!obj.isEmpty()) {
            System.out.println(obj.remove());
            
        }

       
        
    }
    
}
