package Revised_dsa;
import java.util.*;
public class Kadanesalgo {
    public static void kadanes(int arr[],int n)
    {
        int csum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            csum=csum+arr[i];
            if(csum<0)
            {
                csum=0;
            }
            max=Math.max(max, csum);
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
      
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
       
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
kadanes(arr, n);
        
    }
    
}
