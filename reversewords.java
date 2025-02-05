import java.util.*;
public class reversewords {



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String ans="";
        StringBuilder s4= new StringBuilder();
        String []arr =s1.trim().split("\\s+");
  
        for(int i=arr.length-1;i>=0;i--)
        {
            ans=ans+arr[i]+" ";
            
        

        }
        // ans=ans+arr[0];
        // System.out.print(s4);

    }
    
}
