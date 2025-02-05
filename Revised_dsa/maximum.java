package Revised_dsa;
import java.util.*;
public class maximum {
    public static void maximum(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
            else if(arr[i]>thirdmax  && arr[i]!=secondmax && arr[i]!=max)
            {
                thirdmax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondmax);
        System.out.println(thirdmax);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        maximum(arr);
        
    }
    
}
