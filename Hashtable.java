import java.util.Scanner;

public class Hashtable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
        }
        // this is for the sorted array
        // int size=arr[n-1]+1;
        // this is for the unsorted array
        int size=max+1;
        int hash[]=new int[size];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        int c1=1;
        int c=0;
        for(int i=0;i<hash.length;i++)
        {
              c=Math.max(c,hash[i]);

              
        }
        int max1=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<hash.length;i++)
        {
            if(c==hash[i])
            {
        
                  max1=Math.max(max1,i);
            }
            if(c1==hash[i])
             {
                min=Math.min(min,i); 
             }

        }
       
       
        
        int d=max1-min;
       System.out.println("difference is" +  d);
        
        
    }
    
}
