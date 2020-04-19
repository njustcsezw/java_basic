package njustz.algorithm;

import java.util.Arrays;

/**
 * @author njustz
 * @date 2020/4/19
 */
public class ZFloydAlgorithm {
    public static void main(String[] args) {
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        final int N = 65535;
        int [][] weight = new int[][]{
                {0, 5, 7, N, N, N, 2},
                {5, 0, N, 9, N, N, 3},
                {7, N, 0, N, 8, N, N},
                {N, 9, N, 0, N, 4, N},
                {N, N, 8, N, 0, 5 ,4},
                {N, N, N, 4, 5, 0, 6},
                {2, 3, N, N, 4, 6, 0}
        };

        Graph graph = new Graph(vertex.length, weight, vertex);
        graph.floyd();
        graph.show();

    }

    static class Graph{
        private char[] vertex;
        private int[][] dis;
        private int[][] pre;
        public Graph(int length, int[][] matrix, char[] vertex){
            this.vertex = vertex;
            this.dis = matrix;
            this.pre = new int[length][length];
            for (int i = 0; i <length ; i++) {
                Arrays.fill(pre[i], i);
            }
        }

        public void show(){
            for (int i = 0; i < vertex.length; i++) {
                for (int j = 0; j < vertex.length; j++) {
                    System.out.print(vertex[pre[i][j]] +" ");
                }
                System.out.println();
                for (int j = 0; j < vertex.length; j++) {
                    System.out.print("("+vertex[i]+ "," + vertex[j]+")"+"dis=" +dis[i][j] +" ");
                }
                System.out.println();
                System.out.println();
            }
        }

        public void floyd(){
            int len = 0;

            //mid node
            for (int i = 0; i < dis.length; i++) {

                //start node
                for (int j = 0; j < dis.length; j++) {

                    //end node
                    for (int k = 0; k < dis.length; k++) {
                        len = dis[j][i] + dis[i][k];
                        if(len<dis[j][k]){
                            dis[j][k] = len;
                            pre[j][k] = pre[i][k];
                        }
                    }
                }
            }
        }
    }
}
