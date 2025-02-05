package Revised_dsa;

import java.util.Scanner;

public class Removeduplicatesortedarray2 {
    public static     int  removeduplicatesorted(int arr[])
    {
        int ind=2;
        if(arr.length<3)
        return arr.length;
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-2])
            {
                arr[ind]=arr[i];
                ind++;
            }
        }
        return ind;
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
        System.out.println(removeduplicatesorted(arr));
    }
    
}
