import java.util.*;

public class Dijstras {
    public static void dij(int[][] graph, int src) {
        int v = graph.length;
        int[] ans = new int[v];
        boolean[] sptset = new boolean[v];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        for (int i = 0; i < v - 1; i++) {
            int u = minDistance(ans, sptset);
            sptset[u] = true;
            for (int x = 0; x < v; x++) {
                if (!sptset[x] && graph[u][x] != 0 && ans[u] + graph[u][x] < ans[x]) {
                    ans[x] = ans[u] + graph[u][x];

                }
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }

    }

    public static int minDistance(int[] ans, boolean[] sptset) {
        int min = Integer.MAX_VALUE, idx = -1;
        for (int i = 0; i < ans.length; i++) {
            if (!sptset[i] && ans[i] < min)

            {
                min = ans[i];
                idx = i;
            }

        }
        return idx;

    }

    public static void main(String[] args) {

        int graph[][] = { { 0, 1, 0, 2, 0, 0 },
                { 1, 0, 3, 1, 0, 0 },
                { 0, 3, 0, 0, 2, 4 },
                { 2, 1, 0, 0, 1, 0 },
                { 0, 0, 2, 1, 0, 1 },
                { 0, 0, 4, 0, 1, 0 } };
        dij(graph, 0);

    }

}
