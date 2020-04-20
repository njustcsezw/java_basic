package njustz.leetcode;

import java.util.Arrays;

/**
 * Dijkstra
 * @author njustz
 * @date 2020/4/19
 */
public class ZDijkstraAlgorithm {
    public static void main(String[] args) {

        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        final int INF = Integer.MAX_VALUE;
        int [][] weight = new int[][]{
                {0, 5, 7, INF, INF, INF, 2},
                {5, 0, INF, 9, INF, INF, 3},
                {7, INF, 0, INF, 8, INF, INF},
                {INF, 9, INF, 0, INF, 4, INF},
                {INF, INF, 8, INF, 0, 5 ,4},
                {INF, INF, INF, 4, 5, 0, 6},
                {2, 3, INF, INF, 4, 6, 0}
        };

        matrixUDG mu = new matrixUDG(vertex, weight);
        mu.start(1);
        myDjs(1, weight);
       /* Graph graph = new Graph(weight, vertex);
        graph.show();
        graph.djs(6);
        graph.showDjs();*/


    }

    static void myDjs(int index, int[][] weight){
        final int INF = Integer.MAX_VALUE;
        int num = weight.length;

        int[] isVisted = new int[num];
        isVisted[index] = 1;

        int[] dis = new int[num];
        for (int i = 0; i < num; i++) {
            dis[i] = weight[index][i];
        }

        for (int i = 0; i < num; i++) {
            int min = INF ;
            int k = 0;

            for (int j = 0; j < num; j++) {
                if(isVisted[j] == 0 && dis[j] < min){
                    min = dis[j];
                    k =j;
                }
            }

            isVisted[k] = 1;
            for (int j = 0; j < num; j++) {
                if(isVisted[j] == 0 && weight[k][j]!=INF){
                    if(dis[j]>(dis[k]+weight[k][j])){
                        dis[j] = dis[k]+weight[k][j];
                    }
                }
            }
        }

        for(int minDis:dis){
            System.out.print(minDis+" ");
        }

    }

    static class Graph{
        private char[] vertex;
        private int[][] weight;
        private VisitedVertex visitedVertex;

        //private int[][] pre;
        public Graph(int[][] matrix, char[] vertex){
            this.vertex = vertex;
            this.weight = matrix;
           /* this.pre = new int[length][length];
            for (int i = 0; i <length ; i++) {
                Arrays.fill(pre[i], i);
            }*/
        }

        public void show(){
            for(int[] link:weight){
                System.out.println(Arrays.toString(link));
            }
        }

        public void showDjs(){
            visitedVertex.show();
        }

        public void djs(int index){
            this.visitedVertex = new VisitedVertex(vertex.length, index);
            update(index);
            for (int i = 1; i < vertex.length; i++) {
                index = visitedVertex.updateArr();
                update(index);
            }

        }

        public void update(int index){
            int len = 0;
            for (int i = 0; i < weight[index].length; i++) {
                len = visitedVertex.getDis(index) + weight[index][i];
                if(!visitedVertex.isVisited(index) && len<visitedVertex.getDis(i)){
                    visitedVertex.updateDis(i, len);
                    visitedVertex.updatePre(i, index);
                }
            }
        }

    }

    static class VisitedVertex{
        //1表示访问过 0表示未访问
        public int[] already_arr;

        //每个下标对应的前一个顶点的下标 会动态更新
        public int[] pre_visited;

        //记录出发顶点到其它所有顶点的距离，会动态更新
        public int[] dis;

        public VisitedVertex(int length, int index){
            this.already_arr = new int[length];
            this.pre_visited = new int[length];
            this.dis = new int[length];
            Arrays.fill(dis, 65535);
            this.already_arr[index] = 1;
            this.dis[index] = 0;
        }

        //判断index顶点是否访问过
        public boolean isVisited(int index){
            return already_arr[index] == 1;
        }

        public void  updateDis(int index, int len){
            dis[index] = len;
        }

        public void updatePre(int pre, int index){
            pre_visited[pre] = index;
        }

        public int  getDis(int index){
            return dis[index];
        }

        public int updateArr(){
            int min = 65535;
            int index = 0;
            for (int i = 0; i < already_arr.length; i++) {
                if(already_arr[i] == 0 && dis[i]<min){
                    min = dis[i];
                    index = i;
                }
            }
            already_arr[index] = 1;
            return index;
        }

        public void show(){
            System.out.println("================");
            for (int i:already_arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i:pre_visited) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i:dis) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    static class matrixUDG {
        final int INF = Integer.MAX_VALUE;
        int numNodes;
        int[][] matrix;
        int[] prev ;
        int[] dist ;
        char[] vexs;
        //初始化图参数
        public  matrixUDG (char[] vexs, int[][] matrix) {
            this.vexs = vexs;
            this.matrix = matrix;
            numNodes = vexs.length;
            prev = new int[numNodes];
            dist = new int[numNodes];
        }

        // 包括三个数组 1.prev（包含当前节点的上一个父类节点）
        // 2.dist（当前节点与原始节点的距离）
        // 3.原始矩阵matrix[][],储存图
        //	4.isVisited[]标记数组
        public void start(int vs) {

            //初始化类参数
            boolean[] isVisited = new boolean[numNodes];
            for (int i = 0; i < isVisited.length; i++) {
                dist[i] = matrix[vs][i];
                prev[i] = -1;
                if(dist[i] != INF) {
                    prev[i] = vs;
                }
            }
            isVisited[vs] = true;
            //两次循环
            for (int i = 0; i < isVisited.length; i++) {
                int min = INF;
                int k = 0;
                //找到最近的节点
                for (int j = 0; j < isVisited.length; j++) {
                    if(!isVisited[j] && dist[j] < min ) {
                        min = dist[j];
                        k = j;
                    }
                }

                isVisited[k] = true;
                //更新最近路径和父节点
                for (int j = 0; j < isVisited.length; j++) {

                    if(!isVisited[j] && matrix[k][j] != INF) {
                        if(dist[j] > matrix[k][j] + dist[k]) {
                            dist[j] =  matrix[k][j] + dist[k] ;
                            prev[j] = k;
                        }

                    }
                }
            }
            //打印节点、路径、距离
            for (int i = 0; i < isVisited.length; i++) {
                System.out.print( "节点" + i + "  " );
                int a = i;
                System.out.print("路径：");
                while (a != vs) {
                    System.out.print(   prev[a] +"  ");
                    a = prev[a];
                }
                System.out.println("距离" + dist[i]);
            }
        }

    }

}
