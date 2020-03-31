package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/3/31
 */
public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (sc.hasNextInt()){
            a = sc.nextInt();
            //a += a;
            int temp = sc.nextInt();
            a += temp;
            System.out.println(a);
        }

    }
}
