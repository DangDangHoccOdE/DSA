package Graph.src;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSWithRecursion {
    public static void DFS(int u, int[][] graph, Set<Integer> set){
        // process u
        System.out.print(u+" ");

        for (int v=graph.length-1 ; v>=0;v--){
            if(graph[u][v] == 1 && !set.contains(v)){
                set.add(v);
                DFS(v,graph,set);
            }
        }
    }
    public static void main(String[] args) {
            int[][] graph = {
                    {0, 1, 0, 0, 0, 0, 0},
                    {1, 0, 1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 0, 1, 0},
                    {0, 1, 0, 0, 0, 1, 1},
                    {0, 1, 0, 0, 0, 0, 1},
                    {0, 0, 1, 1, 0, 0, 0},
                    {0, 0, 0, 1, 1, 0, 0},
            };

            // Khai bao
            Set<Integer> daDuyet = new HashSet<>();

            // Khoi tao
            daDuyet.add(0);

            // Duyet theo stack
            DFS(0,graph,daDuyet);
        }

}
