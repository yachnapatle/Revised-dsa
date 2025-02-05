package Interviewquestions;
import java.util.*;
public class compare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean ischeck=false;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
            ischeck=false;
            break;
            }
            ischeck=true;
        }
        System.out.println(ischeck);



        boolean b= s1.equalsIgnoreCase(s2);
        System.out.println(b);
    }

    
}
