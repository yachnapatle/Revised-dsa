
import java.util.*;
public class removealphabet {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String s1=sc.next();
       String s2="";
       for(int i=0;i<s1.length();i++)
       {
char ch=s1.charAt(i);
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
{
    s2=s2+ch;
}
       } 

       System.out.println(s2);
    }
    
}
