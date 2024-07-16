import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // int start=0;
        // int end=n-1;
        // while(start<end)
        // {
        //     int temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }
for(int i=0;i<n/2;i++)
{
    int temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
}
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    
}
