import java.util.Scanner;
public class Subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        // int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {         int csum=1;                                              
        
            for(int j=i;j<arr.length;j++)
            {
              
              csum=csum*arr[j];
                             
                
              System.out.println(csum);
                
                // if(csum>ans)
                // {
                //     ans=csum;
                // }
                // System.out.println();
            }
            
        }

           
        }
        
    }
    

