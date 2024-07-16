import java.util.Scanner;
public class Rotatekarray {
    static void reverse(int arr[],int start,int end)
    {
         
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static int[] rotate(int arr[],int k)
    {
        int n=arr.length;
 reverse(arr, 0,n-1);
 reverse(arr, 0, k-1);
 reverse(arr, k, n-1);
 return arr;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[7];
        int k=sc.nextInt();
        for(int i=0;i<7;i++)
        {
            arr[i]=sc.nextInt();
        }
       int arr1[]= rotate(arr, k);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
    
}
