import java.util.*;
public class Removeduplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
if(arr[i]!=arr[i+1])
{
    arr[count]=arr[i];
    count++;
}
                                            
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
