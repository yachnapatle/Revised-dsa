import java.util.*;
      public class stacks {
  static  ArrayList<Integer>list=new ArrayList<>();

//    when we want to calculate pair wise 
// stack is a dynamic data struct5ure we can change size at run time  it is also use in advance t5echniqe like recursion backtracking dfs
// it5 is implemented through ArrayList linklist queue 
// generic arraylist




    public static void push(int data)
    {
        list.add(0,data);
    }
    public static int peek()
    {
        if(list.size()==0)
        return -1;
        return list.get(0);

    }
    public static int pop()
    {
        if(list.size()==0)
        return -1;
        return list.remove(0);
    }
    public static boolean isEmpty()
    {
        return (list.size()==0);
    }
   
    public static void main(String[] args) {
        stacks s= new stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        while (!isEmpty()) {
            System.out.println(s.pop());
            
        }

   
  
    }
    
}
