package njustz.leetcode;

import java.util.Arrays;

/**
 * @author njustz
 * @date 2020/4/19
 */
public class ZDijkstraAlgorithm {
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

        Graph graph = new Graph(weight, vertex);

    }

    static class Graph{
        private char[] vertex;
        private int[][] dis;
        //private int[][] pre;
        public Graph(int[][] matrix, char[] vertex){
            this.vertex = vertex;
            this.dis = matrix;
           /* this.pre = new int[length][length];
            for (int i = 0; i <length ; i++) {
                Arrays.fill(pre[i], i);
            }*/
        }

        public void show(){
            for(int[] link:dis){
                System.out.println(Arrays.toString(link));
            }
        }

    }
}
