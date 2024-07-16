import java.util.*;
public class maximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        Arrays.sort(arr);
        int k=sc.nextInt();
        int sl=arr[arr.length-1];
       
        for(int i=0;i<5;i++)
        {
           
            if(arr[i]<sl  )
            {
                sl=arr[i];
                break;
            }

        }
        System.out.println(sl);

        
    }
}
