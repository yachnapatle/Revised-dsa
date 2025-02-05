import java.util.*;
public class isomorphicstring {
    public static boolean check(String s1,String s2)
    {
        HashMap<Character,Character>map= new HashMap<>();
if(s1.length()!=s2.length())
return false;
for(int i=0;i<s1.length();i++)
{
    char ch=s1.charAt(i);
    char ch1=s2.charAt(i);
    if(map.containsKey(ch))
    {
        if(map.get(ch)!=ch1)
        return false;
    }
    else
    {
        if(map.containsValue(ch1))
        return false;
        map.put(ch,ch1);

    }
}

return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        System.out.println(check(s1, s));
        
    }
    
}
