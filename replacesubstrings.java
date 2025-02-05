import java.util.*;
public class replacesubstrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      String s1=sc.next();
      String s2=sc.next();
      if(!s1.contains(s2))
      {
System.out.println("not exist");
      }
else{
    s1=s1.replace(s2,"fvvghyghy");

}
   System.out.println(s1);     
        
    }
    
}
