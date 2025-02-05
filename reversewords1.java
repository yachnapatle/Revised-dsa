import java.util.*;
public class reversewords1 {
public static String reverse(String s1)
{
String str[]=s1.split(" ");

String ans="";
for(int i=str.length-1;i>0;i--)
{
    ans+=str[i]+" ";
}
ans=ans+str[0];
return ans;



}

    public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
System.out.println(reverse(s1));

        
    }
    
}
