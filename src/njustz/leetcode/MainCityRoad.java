package njustz.leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/20
 */
public class MainCityRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[] rank = new int[num];
            int[][] isRoad = new int[num][num];
            for (int i = 0; i < num; i++) {
                rank[i] = sc.nextInt();
            }

            int N = Integer.MAX_VALUE;
            for (int i = 0; i < num; i++) {
                Arrays.fill(isRoad[i], N);
            }

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if(i==j)
                        isRoad[i][j] = 0;
                }
            }

            for (int i = 0; i < num-1; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                isRoad[x-1][y-1] = 1;
                isRoad[y-1][x-1] = 1;
            }

            int len = 0;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    for (int k = 0; k < num; k++) {
                        if(isRoad[j][i]!=N && isRoad[i][k]!=N){
                            len = isRoad[j][i]+isRoad[i][k];
                            isRoad[j][k] = Math.min(len, isRoad[j][k]);
                        }
                    }
                }
            }

            /*for(int[] ints:isRoad){
                System.out.println(Arrays.toString(ints));
            }*/

            int min = N;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if(rank[i] == rank[j] && i!=j){
                        min = Math.min(min, isRoad[i][j]);
                    }
                }
            }
            System.out.println(min);

        }
    }
}
