import java.util.*;
public class arrayrevision {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter the n");
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }


int max=Integer.MIN_VALUE;
int max1=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{

if(arr[i]>max)
{
    max=arr[i];
}
}
System.out.println(  "first maximum is"+  max);

for(int i=0;i<n;i++)
{

if(arr[i]>max1 && arr[i]!=max )
{
    max1=arr[i];
}
}
System.out.println("second maximum" + max1);

for(int i=0;i<n;i++)
{

if(arr[i]>max2 && arr[i]!=max && arr[i]!=max1 )
{
    max2=arr[i];
}
}
System.out.println("third maximum" + max2);
    }
    
}
