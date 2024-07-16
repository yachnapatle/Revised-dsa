
import java.util.*;
public class sd {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the size of array");
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int arr[]= new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1 && arr[i]!=max)
            {
                max1=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
if(arr[i]>max2 && arr[i]!=max1 && arr[i]!=max)
{
    max2=arr[i];
}
        }
        System.out.println("first maximum of the array is" +max);
        System.out.println( "second maximum of the array is" +max1);
        System.out.println( "third maximum of the array is" +max2);
    }
    
}

