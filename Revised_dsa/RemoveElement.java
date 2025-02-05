package Revised_dsa;
import java.util.Scanner;
public class RemoveElement {
    public static int REmoveval(int arr[],int n,int val)
    {
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=val)
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
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
    
        System.out.println("enter the values which you want to remove");

        int val=sc.nextInt();

       System.out.println(REmoveval(arr, n, val)); 
    }
    
}
