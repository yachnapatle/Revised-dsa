package Revised_dsa;
import java.util.*;
public class Maximumones {
    public static int MaxCount(int arr[],int n)
    {

int count=0,ans=0;
for(int i=0;i<arr.length;i++)
{
    if(arr[i]==1)
    {
        count++;
        ans=Math.max(ans, count);
    }
    else
    {
        count=0;
    }
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
        System.out.println(MaxCount(arr, n));
    }
    
}
