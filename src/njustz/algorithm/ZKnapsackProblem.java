package njustz.algorithm;


import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * @author njustz
 * @date 2020/4/10
 */
public class ZKnapsackProblem {
    public static void main(String[] args) {
        //物品重量
        int[] weight = {1, 4, 3};
        //物品价值
        int[] value = {1500, 3000, 2000};
        //背包容量
        int m = 4;
        //物品的个数
        int n = value.length;

        //最大价值
        int[][] totalValue = new int[n+1][m+1];
        //记录背包商品个数
        int[][] path = new int[n+1][m+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0 || j==0){
                    totalValue[i][j] = 0;
                } else if (weight[i-1]>j){
                    totalValue[i][j] = totalValue[i-1][j];
                }else{
                    /*totalValue[i][j] = Math.max(totalValue[i-1][j],
                            value[i-1]+totalValue[i-1][j-weight[i-1]]);*/
                    if(totalValue[i-1][j]<( value[i-1]+totalValue[i-1][j-weight[i-1]])){
                        totalValue[i][j] = value[i-1]+totalValue[i-1][j-weight[i-1]];
                        path[i][j] = 1;
                    }else {
                        totalValue[i][j] = totalValue[i-1][j];
                    }
                }

            }
        }

        for (int i = 0; i < totalValue.length; i++) {
            System.out.println(Arrays.toString(totalValue[i]));
        }

        int i = path.length-1;
        int j = path[0].length-1;
        while (i>0 && j>0){
            if(path[i][j] == 1){
                System.out.printf("第%d个商品放入到背包\n", i);
                j -= weight[i-1];
            }
            i--;
        }

    }
}
