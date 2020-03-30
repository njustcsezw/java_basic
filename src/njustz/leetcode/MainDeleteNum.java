package njustz.leetcode;

import java.util.Scanner;

/**
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数
 * 到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。
 * 以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除)
 * 如此循环直到最后一个数被删除。
 * @author njustz
 * @date 2020/3/30
 */
public class MainDeleteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            if(n>=1000){
                int[] num = new int[999];
                int last = delete(num);
                System.out.println(last);
            }else{
                int[] num = new int[n];
                int last = delete(num);
                System.out.println(last);
            }
        }
    }

    static int delete(int[] arr){
        int count = 0;
        int last = 0;
        int num =0;
        while ( count < arr.length){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    num++;
                }
                if(num ==3){
                    arr[i] = -1;
                    num = 0;
                    count++;
                    last = i;
                }
            }
        }
        return last;
    }
}

