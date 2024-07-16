import java.util.*;
public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        n=arr.length+1;
int acsum=( n*(n+1))/2;
int missing=acsum-sum;
System.out.println(missing);
        
    }
    
}
