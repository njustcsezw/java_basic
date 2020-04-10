package njustz.data_structure.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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
        //graph.dfsShow();
        graph.bfsShow();
    }
}

//邻接矩阵存储图
class Graph{
    private ArrayList<String> vertexList;
    private int[][] edges;
    private int numOfEdges;
    private boolean[] isVisited;

    public Graph(int n){
        edges = new int[n][n];
        vertexList = new ArrayList<>(n);
        numOfEdges = 0;
        isVisited = new boolean[n];
    }

    //得到第一个邻接节点的坐标
    //不存在则返回-1
    public int getFirstNeighbor(int index){
        for (int i = 0; i < vertexList.size(); i++) {
            if(edges[index][i] > 0){
                return i;
            }
        }
        return -1;
    }

    public int getNextNeighbor(int v1, int v2){
        for(int i = v2+1; i<vertexList.size(); i++){
            if(edges[v1][i]>0)
                return i;
        }
        return -1;
    }

    public void dfsShow(boolean[] isVisited, int i){
        System.out.print(getValueByIndex(i)+ "->");
        isVisited[i] = true;
        int w = getFirstNeighbor(i);
        while (w != -1){
            if(!isVisited[w]){
                dfsShow(isVisited, w);
            }
            w = getNextNeighbor(i, w);
        }
    }

    public void bfsShow(boolean[] isVisited, int i){
        int u;
        int w;
        LinkedList queue = new LinkedList();
        System.out.print(getValueByIndex(i) + "->");
        isVisited[i] = true;
        queue.addLast(i);
        while (!queue.isEmpty()){
            u = (Integer)queue.removeFirst();
            w = getFirstNeighbor(u);
            while (w != -1){
                if(!isVisited[w]){
                    System.out.print(getValueByIndex(w)+"->");
                    isVisited[w] = true;
                    queue.addLast(w);
                    //bfsShow(isVisited, w);
                }
                w = getNextNeighbor(u, w);
            }
        }
    }

    public void dfsShow(){
        for (int i = 0; i < getNumOfVertex(); i++) {
            if(!isVisited[i]){
                dfsShow(isVisited, i);
            }
        }
    }

    public void bfsShow(){
        for (int i = 0; i < getNumOfVertex(); i++) {
            if(!isVisited[i]){
                bfsShow(isVisited,i);
            }
        }
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
