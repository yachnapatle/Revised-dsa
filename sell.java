import java.util.Scanner;
public class sell {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int profit=0;
        int max=0;
        for(int i=0;i<n;i++)
{
profit=0;
    for(int j=i+1;j<n;j++)
    {
        profit=arr[j]-arr[i];
max=Math.max(max,profit);

    }
        
} 
System.out.println(max);   
    }
    
}
