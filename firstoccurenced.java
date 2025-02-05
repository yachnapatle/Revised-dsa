import java.util.*;
public class firstoccurenced {
    public static int index(String s1,String s2)
    {
        int n=s1.length();
        int n1=s2.length();
        for(int i=0;i<n-n1+1;i++)
        {
            if(s1.charAt(i)==s2.charAt(0))
            {
                if(s1.substring(i, s2.length()+i).equals(s2))
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2= sc.nextLine();
        System.out.println(index(s1, s2));

    }
    
}
