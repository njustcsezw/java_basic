package njustz.leetcode;

import java.util.Scanner;

/**
 *
 * 接受一个十六进制的数，输出该数值的十进制表示
 * @author njustz
 * @date 2020/3/29
 */
public class MainTransfer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null ;
        while(scanner.hasNextLine()){
            int num = 0;
            int exp;
            str = scanner.nextLine().toLowerCase();
            for (int j = 2; j <str.length(); j++) {
                exp = (int)Math.pow(16, str.length()-j-1);
                if ('a'<=str.charAt(j)&&str.charAt(j)<='z') {
                    Math.pow(16, j-2);
                    num += (str.charAt(j)-87)*exp;
                } else {
                    num += (str.charAt(j)-48)*exp;
                }
            }

            System.out.println(num);
            //System.out.println(Integer.parseInt(str, 16));
        }
        scanner.close();
    }
}

