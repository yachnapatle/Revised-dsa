package Revised_dsa;
import java.util.*;
public class BinarySearch {
    public static int binarysearch1(int arr[],int key)
    {
        int i=0;
        int j=arr.length-1;
       

        // o(log2n)time complexity of the binary search
        while (i<=j) 
        {

            int mid=i+(j-i)/2;
            if(arr[mid]==key)
            return mid;
            else if(arr[mid]>key)
            j=mid-1;
            else
            i=mid+1;
            
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();

        }
System.out.println("enter the value of key");
int key=sc.nextInt();
System.out.println(binarysearch1(arr, key));
        
    }
    
}
