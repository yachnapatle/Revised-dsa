import java.util.Scanner;
public class stringpallindrom {
    public static boolean check(String s){
        int i=0;
        int j=s.length()-1;
       while(i<j)
       {
        if(s.charAt(i)!=s.charAt(j))
        {
        return false;
        }
        i++;
        j--;
       }
return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.println("enter string");
        s=sc.nextLine();
        System.out.println(check(s));
      

    }
    
}
