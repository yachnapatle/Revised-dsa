package Revised_dsa;

import java.util.Scanner;

public class BUbblesort {
    public static void bubblesort(int arr[],int n)
    {
        for( int turn=0;turn<n-1;turn++)
        {
            for(int j=0;j<n-turn-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                
                
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
           
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
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
bubblesort(arr, n);
        
    }
    
}
