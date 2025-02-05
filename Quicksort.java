import java.util.*;
public class Quicksort {

// quick sort is a sorting algorithm which uses the technique of pivot and partitioning in which one element is se;ected as pivot and 
// it is placed at is sorted position and the array is partiotioned from that pivot and this process is repeat the array become sorted

// randomize quick sort
// chote ke liye merge sort
// bade ke liye quick sort
// array.sort collection.sort   merge quick



    public static void quic(int arr[],int s,int e) 
    {
        if(s>=e)
return;
int pivot=partition(arr,s,e);
quic(arr, s, pivot-1);
quic(arr, pivot+1, e);
 

}
public static int partition(int [] arr,int s,int e)
{
    int pivot=arr[e];
    int i=s-1;
    for(int j=s;j<e;j++)
    {
        if(arr[j]<pivot)
        {
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }

    }
    i++;
    int temp=arr[i];
    arr[i]=arr[e];
    arr[e]=temp;
    return i;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
arr[i]=sc.nextInt();       
    }
    quic(arr, 0, n-1);
    for(int i=0;i<n;i++)
    {
System.out.print(arr[i]+ " ");      
}

}
}
