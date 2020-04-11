package njustz.algorithm;

import java.util.Arrays;

/**
 * Prim算法
 * 生成最小生成树MST
 * @author njustz
 * @date 2020/4/11
 */
public class ZPrimAlgorithm {
    public static void main(String[] args) {
        char[] data = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int [][] weight = new int[][]{
            {10000, 5, 7, 10000, 10000, 10000, 2},
            {5, 10000, 10000, 9, 10000, 10000, 3},
            {7, 10000, 10000, 10000, 8, 10000, 10000},
            {10000, 9, 10000, 10000, 10000, 4, 10000},
            {10000, 10000, 8, 10000, 10000, 5 ,4},
            {10000, 10000, 10000, 4, 5, 10000, 6},
            {2, 3, 10000, 10000, 4, 6, 10000}
        };
        MGraph mGraph = new MGraph(7);
        MinTree minTree = new MinTree();
        minTree.createGraph(mGraph, 7, data, weight);
        //minTree.showGraph(mGraph);
        minTree.prim(mGraph, 0);
        minTree.prim2(data, weight, 1);
    }
}

class MGraph{
    int verx;
    char[] data;
    int[][] weight;

    public MGraph(int verx){
        this.verx = verx;
        data = new char[verx];
        weight = new int[verx][verx];
    }
}

class MinTree{

    public void prim(MGraph mGraph, int v){
        //标记订点是否被访问过
        int visited[] = new int[mGraph.verx];
        visited[v] = 1;

        //记录两个顶点的下标
        int h1 = -1;
        int h2 = -1;
        int minWeight = 10000;
        for (int i = 1; i < mGraph.verx; i++) {

            for (int j = 0; j < mGraph.verx; j++) {
                for (int k = 0; k < mGraph.verx; k++) {
                    if(visited[j]==1 && visited[k]==0 &&
                            mGraph.weight[j][k]<minWeight){
                        minWeight = mGraph.weight[j][k];
                        h1 = j;
                        h2 = k;

                    }
                }
            }
            System.out.println("edge<" + mGraph.data[h1] + ","
                    + mGraph.data[h2] + ">weight:" + minWeight);
            visited[h2] = 1;
            minWeight = 10000;
        }
    }

    public void prim2(char[] data, int[][]weight, int v){
        //标记订点是否被访问过
        int visited[] = new int[data.length];
        visited[v] = 1;

        //记录两个顶点的下标
        int h1 = -1;
        int h2 = -1;
        int minWeight = 10000;
        for (int i = 1; i < data.length; i++) {

            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < data.length; k++) {
                    if(visited[j]==1 && visited[k]==0 &&
                            weight[j][k]<minWeight){
                        minWeight = weight[j][k];
                        h1 = j;
                        h2 = k;

                    }
                }
            }
            System.out.println("edge<" + data[h1] + ","
                    + data[h2] + ">weight:" + minWeight);
            visited[h2] = 1;
            minWeight = 10000;
        }
    }

    public void createGraph(MGraph mGraph, int verxs, char[] data, int[][] weight){
        int i, j;
        for (int k = 0; k < verxs; k++) {
            mGraph.data[k] = data[k];
            for (int l = 0; l < verxs; l++) {
                mGraph.weight[k][l] = weight[k][l];
            }
        }
    }

    public void showGraph(MGraph mGraph){
        for (int[] link: mGraph.weight) {
            System.out.println(Arrays.toString(link));
        }
    }
}
