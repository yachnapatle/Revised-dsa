import java.util.*;
public class str {
    public static void main(String[] args) {
        String s1= new String("hello");
        String s2= new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        StringBuilder s4= new StringBuilder();
        StringBuffer s3= new StringBuffer();
        System.out.println(s4==s3);
        System.out.println(s1.equals(s2));


        
    }
    
}
