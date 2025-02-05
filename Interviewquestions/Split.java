package Interviewquestions;
import java.util.*;
public class Split {
    public static void main(String[] args) {
        String s="12345-_hbjub844";
        String str[]=s.split("-");
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
    
}
