package Revised_dsa;
import java.util.*;
public class Hashtable {
    public static void hash(int arr[],int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int hasTable[]=new int[max+1];
for(int i=0;i<n;i++)
{
    hasTable[arr[i]]++;
    
}
for(int i=0;i<hasTable.length;i++)
{
    System.out.print(hasTable[i]);
}
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
hash(arr, n);

    }
    
}
