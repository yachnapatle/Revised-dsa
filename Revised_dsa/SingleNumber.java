package Revised_dsa;
import java.util.*;
public class SingleNumber {
    public static int single(int arr[],int n)
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter values of n");
        int n=sc.nextInt();
        System.out.println("enter the valus in the array");
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(single(arr, n));
    }
    
}
