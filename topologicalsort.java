import java.util.*;
public class topologicalsort {
    static class Edge{
        int src,des;
        Edge (int s,int d)
        {
            this.src=s;
            this.des=d;
        }

    }

    public static void createGraph(ArrayList<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        



    }
    public static void toposort(ArrayList<Edge>graph[])
    {
        Stack<Integer>s=new Stack<>();
        boolean[]vis=   new  boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                dfs(graph,i,vis,s);
            }
            
        }
    }
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean [] vis,Stack<Integer>s)
    {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e= graph[curr].get(i);
            if(!vis[e.des])
            {
                dfs(graph, e.des, vis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>graph[]=new ArrayList[v];
        createGraph(graph);
        toposort(graph);
       
        
    }
    
}
