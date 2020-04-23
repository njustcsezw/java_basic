package njustz.leetcode;

/**
 * @author njustz
 * @date 2020/4/21
 */
public class MainFlower {
    public static void main(String[] args) {
        int n = 3;
        int MOD = (int)Math.pow(10, 9)+7;
        int[] choice = {0, 1, 2, 4, 5};
        int[][] dp = new int[5][n+1];
        for (int i = 0; i < 5; i++) {
            dp[i][1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
                int x = choice[j];
                for (int k = 0; k < 5; k++) {
                    int y = choice[k];
                    if((x&y) == 0){
                        dp[j][i] += dp[k][i-1];
                        dp[j][i] %= MOD;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += dp[i][n];
            result %= MOD;
        }
    }
}
