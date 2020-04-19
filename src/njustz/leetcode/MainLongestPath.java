package njustz.leetcode;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * @author njustz
 * @date 2020/4/19
 */
public class MainLongestPath {
    public static void main(String[] args) {
        int[] u = {2, 3, 5, 4, 5 ,5};
        int[] v = {5, 2, 1, 6, 7, 4};
        int[] w = {15, 6, 14, 4, 1, 6};
        System.out.println(solve(7, u, v, w));
    }

    static long solve (int n, int[] u, int[] v, int[] w) {
        int N = Integer.MAX_VALUE;
        int[][] dis = new int[n][n];
        for (int i = 0; i < n-1; i++) {
            dis[u[i]-1][v[i]-1] = w[i];
            dis[v[i]-1][u[i]-1] = w[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    dis[i][j] = 0;
                }else {
                    if(dis[i][j] == 0)
                        dis[i][j] = N;
                }
            }
        }
        for (int[] link:dis) {
            System.out.println(Arrays.toString(link));
        }
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(dis[j][i]>0 && dis[j][i]<N && dis[i][k]>0 && dis[i][k]<N){
                        len = dis[j][i] + dis[i][k];
                        if(dis[j][k]==N){
                            dis[j][k] = len;
                        }

                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(dis[i]));
           Arrays.sort(dis[i]);
           if(max<dis[i][n-1])
               max = dis[i][n-1];
        }

        // write code here
        return max;
    }
}
