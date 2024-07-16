import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            
            if(map.containsKey(arr[i]))
            {
int value=map.get(arr[i]);
map.put(arr[i],value+1);
            }
            else
            {
                map.put(arr[i],1);
            }
          
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {

            max=Math.max(max,e.getValue());
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {

           if(e.getValue()==max)
           {System.out.println(e.getKey());

           }
        }

        // System.out.println(map);
        // System.out.println(map.size());
        // map.put(26, 3);
        // map.put(7, 4);
    //     System.out.println(map);
    //     System.out.println(map.size());
    //     System.out.println(map.get(27));
    //   map.remove(26);
    // map.put(28, 4);
    // map.put(9, 84);
    // map.put(30, 14);
    //   System.out.println(map);
    }
    
}
