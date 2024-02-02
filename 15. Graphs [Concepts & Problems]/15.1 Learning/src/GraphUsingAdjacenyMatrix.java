public class GraphUsingAdjacenyMatrix {
    public static void main(String[] args) {
        //For Undirected graphs
        //M is edges and N is number of Nodes
        int M = 3,N = 3;
        int [][] graph = new int[N+1][N+1];
        //edge 1-2;
        graph[1][2]=1;
        graph[2][1]=1;
        //edge 2-3
        graph[2][3]=1;
        graph[3][2]=1;
        //edge 1-3
        graph[1][3]=1;
        graph[3][1]=1;



//        edge u - v
        //graph[u][v] = 1;
        //graph[v][u] = 1;
    }
}
