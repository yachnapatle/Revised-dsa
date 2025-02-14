package Revised_dsa;

import java.util.Scanner;

public class LeftRotation {
    static void reverse(int arr[],int start,int end)
    {
         
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static int[] rotate(int arr[],int n,int k)
    {
       
 reverse(arr, 0,n-1);
 reverse(arr, 0, k);
 reverse(arr, k+1, n-1);
 return arr;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k=sc.nextInt();

int arr2[]=rotate(arr, n, k);
for(int i=0;i<arr2.length;i++)
{
    System.out.print(arr2[i] +" ");
}


        
    }
    
}
