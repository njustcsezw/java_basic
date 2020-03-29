package njustz.leetcode;

import java.util.Scanner;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000）
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序
 * 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 * @author njustz
 * @date 2020/3/29
 */
public class MingRandom {
    static int[] work(int[] arr){
        int[] temp =new int[arr.length];
        int tempc = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isFlag = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    isFlag = false;
                }
            }
            if(isFlag){
                temp[tempc ++] = arr[i];
            }
        }

        
        int[] work = new int[tempc];
        for (int i = 0; i < tempc; i++) {
            work[i] = temp[i];
        }

        for (int i = 0; i < work.length; i++) {
            for (int j = 0; j < work.length -1- i; j++) {
                int k = 0;
                if(work[j] > work[j+1]){
                    k = work[j];
                    work[j] = work[j+1];
                    work[j+1] = k;
                }
            }
        }
        
        return work;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] after = work(a);
            for (int i = 0; i < after.length; i++) {
                System.out.println(after[i]);
            }
        }
    }
}
