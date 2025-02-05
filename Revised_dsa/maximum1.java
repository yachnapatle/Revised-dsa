package Revised_dsa;

import java.util.Arrays;

public class maximum1 {

    public static void main(String[] args) {
        int arr []={1,5,2,9,11};
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        int larger=arr[0];
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>larger)
            {
                larger=arr[i];
            }
        }
        System.out.println(larger);
         Arrays.sort(arr);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(secondlargest!=larger)
            {
                secondlargest=arr[i];
                break;
            }
        }
        System.out.println(secondlargest);
    }
    
}
