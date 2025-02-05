import java.util.HashMap;

public class Solution1 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character>map1= new HashMap<>();
    
          for(int i=0;i<s.length();i++)
          {
            char ch1=s.charAt(i);
             char ch2=t.charAt(i);

            if(map1.containsKey(ch1)==true)
            {
                if(map1.get(ch1)!=ch2)
                {
                    return false;
                }
               
                
            }
else
{
     if( map1.containsValue(ch2))
                {
                    return false;
                }
                map1.put(ch1,ch2);
}

       
            
          }
       return true; 
    }
    public static void main(String[] args) {
String s1="egy";
String s2="add";
System.out.println(isIsomorphic(s1,s2));

           }

} 
    

