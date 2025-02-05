package Interviewquestions;
import java.util.*;
public class Firstnonrepeating {
    public static void main(String[] args) {
        int hash[]=new int[26];
        String s1="aabbde";
        for(int i=0;i<s1.length();i++)
        {
            hash[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++)
        {
            if(hash[s1.charAt(i)-'a']==1)
            {
                System.out.println(s1.charAt(i));
                break;
            }
        }
        

    }
    
}
