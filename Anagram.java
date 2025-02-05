
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] hash= new int[26];
        String s=sc.next();
        String t=sc.next();

    for(int i=0;i<s.length();i++)
    {
        hash[s.charAt(i)-'a']++;
    }
     for(int i=0;i<t.length();i++)
    {
        hash[t.charAt(i)-'a']--;
    }

    for(int i=0;i<26;i++)
    {
        if(hash[i]!=0)
        {
System.out.println("not");
        }
    }
    }
    
}
