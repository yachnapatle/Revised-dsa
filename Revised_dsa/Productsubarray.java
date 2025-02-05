package Revised_dsa;

import java.util.Scanner;

public class Productsubarray {
public static int  maximumproduct(int arr[],int n)
{

    int max=Integer.MIN_VALUE;
    int max1=Integer.MIN_VALUE;
    double pro=1;
    double pro1=1;
    for(int i=0;i<arr.length;i++)
    {
        pro=pro*arr[i];
        if(pro>max)
        {
            max= (int)pro;
        }
        if(pro==0)
        {
            pro=1;
        }
    }
    for(int i=n-1;i>=0;i--)
    {
        pro1=pro1*arr[i];
        if(pro1>max1)
        {
            max1= (int)pro1;
        }
        if(pro1==0)
        {
            pro1=1;
        }
    }

 return Math.max(max, max1);
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
        System.out.println(maximumproduct(arr, n));
    }
    
}
