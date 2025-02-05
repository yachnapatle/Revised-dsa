package Revised_dsa;

import java.util.Scanner;

public class insertionsort {
    public static void insertionsort(int arr[],int n)
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the values in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        insertionsort(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
