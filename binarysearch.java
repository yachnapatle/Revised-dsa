import java.util.*;
public class binarysearch {
    static void search(int arr[],int key)
    {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int ans=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(key==arr[mid])
            {
                ans=mid;
                break;
            }
            else if(key>arr[mid])
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
System.out.println("enter key");
int key=sc.nextInt();
search(arr, key);
        
    }
   
    
}
