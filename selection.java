import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new  int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
for(int i=0;i<n-1;i++)
{
   min=i;
    for(int j=i+1;j<n;j++)
    {
      if(arr[min]>arr[j])
      {
        min=j;
      }  
        
    }
    int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;

    
}
 
for(int i=0;i<=n;i++)
{
    System.out.print(arr[i] + " ");
}

    }
    
}
