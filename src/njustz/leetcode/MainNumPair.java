package njustz.leetcode;

import javax.tools.ForwardingFileObject;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/16
 */
public class MainNumPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean flag = false;
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i; j < arr.length-1-i; j++) {
                    if(arr[j]>arr[j+1]){
                        flag = true;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                if(!flag){
                    break;
                }else {
                    flag = false;
                }
            }
            //System.out.println(Arrays.toString(arr));
            int pairx = k/n;
            int pairy = k%n;
            System.out.println("("+arr[pairx] +","+arr[pairy-1] +")");
        }
    }
}
