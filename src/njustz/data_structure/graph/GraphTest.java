package njustz.data_structure.graph;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author njustz
 * @date 2020/4/10
 */
public class GraphTest {
    public static void main(String[] args) {
        int n = 5;
        String[] vertex = {"A", "B", "C", "D", "E"};
        Graph graph = new Graph(n);
        for(String string:vertex){
            graph.insertVertex(string);
        }
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1);
        graph.showGraph();
    }
}

//邻接矩阵存储图
class Graph{
    private ArrayList<String> vertexList;
    private int[][] edges;
    private int numOfEdges;

    public Graph(int n){
        edges = new int[n][n];
        vertexList = new ArrayList<>(n);
        numOfEdges = 0;
    }

    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    public void insertEdge(int v1, int v2, int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    public int getNumOfVertex(){
        return vertexList.size();
    }

    public int getNumOfEdges(){
        return numOfEdges;
    }

    public String getValueByIndex(int i){
        return vertexList.get(i);
    }

    public int getWeight(int v1, int v2){
        return edges[v1][v2];
    }

    public void showGraph(){
        for(int[] link : edges){
            System.out.println(Arrays.toString(link));
        }
    }
}
