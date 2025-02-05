package Revised_dsa;

import java.util.Scanner;

public class selectionsort {
    public static void selectionsort(int arr[],int n)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
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
        selectionsort(arr, n);


    }
    
}
