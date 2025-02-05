package Revised_dsa;
import java.util.*;
public class LinearSearch {

public static int linear(int arr[],int key)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==key)
        {
            return i;
        }
    }
    return -1;
}


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    
        int arr[]= new int[5];
        System.out.println("enter vthe array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of key");
        int key=sc.nextInt();
int y=linear(arr,key);
System.out.println(y);

    }
    
}
