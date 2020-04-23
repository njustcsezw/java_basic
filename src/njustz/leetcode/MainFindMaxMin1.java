package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/22
 */
public class MainFindMaxMin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] ints = new int[m];
            int sum = 0;
            for (int i = 0; i < m; i++) {
                ints[i] = scanner.nextInt();
                sum += ints[i];
            }

            //int[][] split = new int[][];

            /*int left = sum;
            int temp = 0;
            int index = 0;
            for (int i = 0; i < k-1; i++) {
                temp = left/(k-i);
                int tempSum = 0;
                for (int j = index; j < m; j++) {
                    tempSum += ints[j];
                    System.out.print(ints[j] + " ");
                    if(tempSum>=temp){
                        index = j+1;
                        System.out.print("/" + " ");
                        left = left-tempSum;
                        break;
                    }
                }
            }
            for (int i = index; i < m; i++) {
                if(i == m-1){
                    System.out.print(ints[i]);
                }else{
                    System.out.println(ints[i] + " ");
                }
            }*/
        }
    }
}
