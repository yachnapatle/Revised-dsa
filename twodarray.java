import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n;

        n=sc.nextInt();
        System.out.println("enter n");
        int m=sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i>j)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
               
            }
            
        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
             
                System.out.print(arr[i][j] + " ");


            }
            System.out.println();
            
        }


    }
    
}
