import java.util.*;
public class mergesort {

    public static void mergesort(int arr[],int s,int e) 
    {
        if(s>=e)
        return;
        int mid=s+(e-s)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }
    public static void merge(int [] arr,int s,int mid,int e)
    {
        int left=mid-s+1;
        int right=e-mid;
        int []l=new int[left];
       int []r=new int[right];
        for(int i=0;i<left;i++) 
        {
            l[i]=arr[s+i];
        }
        for(int i=0;i<right;i++)
        {
            r[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=s;
        while (i<left && j<right)
        {
            if(l[i]<r[j])
            {
                arr[k++]=l[i++];
            }
            else
            {
                arr[k++]=r[j++];
            }
           
        }
        while (i<left) {
            arr[k++]=l[i++];
            
        }
        while (j<right) {
            arr[k++]=r[j++];
            
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]);

        }
    }
    
}
