package Revised_dsa;
import java.util.*;
public class Reverse {
    public static void reverse(int arr[])
    {

        // this is one way for reversing the array elements
        // int start=0;
        // int end=arr.length-1;
        // while(start<end)
        // {
        //     int temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }
        int n=arr.length;
for(int i=0;i<n/2;i++)
{
    int temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
}
for(int i=0;i<n;i++)
{
    System.out.print(arr[i]+" ");
}





    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();  
        }
        reverse(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");  
        // }

    
    }
    
}
