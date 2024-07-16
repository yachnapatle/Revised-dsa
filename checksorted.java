import java.util.*;
public class checksorted {
    static boolean search(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]<arr[i] )
            {
               return false;
            }
            
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(search(arr, n));
        
    }
    
}
