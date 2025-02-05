import java.util.*;
public class commonprefix {
    public static String pre(String str[])
    {
        String s1=str[0];
        String s2=str[str.length-1];
        int index=0;
        Arrays.sort(str);
        while (index<s1.length()) {
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            
            else
            break;
            
        }
        return index==0?"":s1.substring(0,index);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
String [] str={"flower","flow","flight"};

System.out.println(pre(str));


    }
    
}
