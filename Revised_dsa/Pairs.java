package Revised_dsa;
import java.util.*;
public class Pairs {
    public static void pairsprint(int arr[])
    {
        int tp=0;
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
System.out.print( "(" +  curr  + "," + arr[j] + ")" );
tp++;
            }
        }
        System.out.println("so the total number of pair is" + tp);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ente the array elements");
int arr[]=new int[5];
for(int i=0;i<arr.length;i++)
{
    arr[i]=sc.nextInt();
}
   
pairsprint(arr);

    }
    
}
