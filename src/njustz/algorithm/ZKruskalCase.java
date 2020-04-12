package njustz.algorithm;

import java.util.Arrays;

/**
 * MST
 * Kruskal
 * @author njustz
 * @date 2020/4/12
 */
public class ZKruskalCase {

    private int edgeNum;
    private char[] vertexs;
    private int[][] matrix;
    private static final int INF = Integer.MAX_VALUE;

    public ZKruskalCase(char[] vertexs, int[][] matrix){
        int vlen = vertexs.length;
        this.vertexs = new char[vlen];
        for (int i = 0; i < vlen; i++) {
            this.vertexs[i] = vertexs[i];
        }

        this.matrix = new int[vlen][vlen];
        for (int i = 0; i < vlen; i++) {
            for (int j = 0; j < vlen; j++) {
                this.matrix[i][j] = matrix[i][j];
                if(matrix[i][j] != INF && matrix[i][j]!=0){
                    this.edgeNum++;
                }
            }
        }
        this.edgeNum = edgeNum/2;
    }

    public void show(){
        System.out.println(edgeNum);
        for(int[] link:matrix){
            System.out.println(Arrays.toString(link));
        }
    }

    public void sortEdge(EData[] data){
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-1-i; j++) {
                if(data[j].weight > data[j+1].weight){
                    EData temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public int getPosition(char ch){
        for (int i = 0; i < vertexs.length; i++) {
            if(vertexs[i]== ch){
                return i;
            }
        }
        return -1;
    }

    public EData[] getEdges(){
        int index = 0;
        EData[] data = new EData[edgeNum];
        for (int i = 0; i < vertexs.length; i++) {
            for (int j = i+1; j < vertexs.length; j++) {
                if(matrix[i][j] != INF){
                    data[index++] = new EData(vertexs[i], vertexs[j], matrix[i][j]);
                }
            }
        }
        return data;
    }

    //i 表示传入的顶点的下标
    //ends数组记录了各个顶点对应的终点是哪个，遍历过程中逐渐形成
    public int getEnd(int[] ends, int i){
        while (ends[i] != 0){
            i = ends[i];
        }
        return i;
    }

    public void kruskal(){
        int index = 0;
        //保存已有MST中每个顶点在最小生成树中的终点
        int[] ends = new int[edgeNum];
        //创建结果数组，保存最后的MST
        EData[] rets = new EData[edgeNum];

        //获取图中所有边的集合
        EData[] edges = getEdges();
        //排序
        sortEdge(edges);
        //添加入MST中，判断是否回路
        for (int i = 0; i < edgeNum; i++) {

            int p1 = getPosition(edges[i].start);
            int p2 = getPosition(edges[i].end);

            int m = getEnd(ends, p1);
            int n = getEnd(ends, p2);
            if(m != n){
                ends[m] = n;
                rets[index++] = edges[i];
            }
        }

        //输出MST
        System.out.println("MST；" + Arrays.toString(rets));
    }

    public static void main(String[] args) {
        char[] vertexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[][] matrix = {
                {0, 12, INF, INF, INF, 16, 14},
                {12, 0, 10, INF, INF, 7, INF},
                {INF, 10, 0, 3, 5, 6, INF},
                {INF, INF, 3, 0, 4, INF, INF},
                {INF, INF, 5, 4, 0, 2, 8},
                {16, 7, 6, INF, 2, 0, 9},
                {14, INF, INF, INF, 8, 9, 0}
        };

        ZKruskalCase zKruskalCase = new ZKruskalCase(vertexs, matrix);
        //zKruskalCase.show();
        //EData[] data = zKruskalCase.getEdges();
        //System.out.println(Arrays.toString(data));
        //zKruskalCase.sortEdge(data);
        //System.out.println(Arrays.toString(data));
        zKruskalCase.kruskal();
    }
}

class EData{
    char start;
    char end;
    int weight;

    public EData(char start, char end, int weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "EData{" +
                "start=" + start +
                ", end=" + end +
                ", weight=" + weight +
                '}';
    }
}
