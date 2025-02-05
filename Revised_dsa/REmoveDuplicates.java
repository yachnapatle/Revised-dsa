package Revised_dsa;
import java.util.*;
public class REmoveDuplicates {
    public static void remove(int arr[])
    {

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length-1 && arr[i]==arr[i+1])
            continue;
            else
            {
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]= new int[6];
    System.out.println("enter the size of the array");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    
remove(arr);
    
}
    
}
