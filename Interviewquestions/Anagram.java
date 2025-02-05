package Interviewquestions;
import java.util.*;
public class Anagram {
    public static boolean check(String s1,String s2)
    {
        // char a1[]=s1.toCharArray();
        // char a2[]=s2.toCharArray();

        // Arrays.sort(a1);
        // Arrays.sort(a2);
        // return Arrays.equals(a1, a2);


        int hash[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            hash[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            hash[s2.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++)
        {
            if(hash[i]!=0)
            {
                return false;
            }
        }
return true;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(check(s1, s2));
        
        
    }
    
}
