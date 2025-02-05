import java.util.*;
public class vowel {
    public static boolean check(char s)

    {

        if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||s=='a' || s=='e'|| s=='i' || s=='o' || s=='u')
        return true;

        return false;
    }

{


}  

public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char s=sc.next().charAt(0);
    System.out.println(check(s));
       
    }
    
}
