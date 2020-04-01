package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/1
 */
public class MainLastNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(sc.hasNextLine()){
            str = sc.nextLine();
            String[] str1 = str.split(" ");
            if((str1.length -1)>=0){
                System.out.println(str1[str1.length - 1].length());
            }
        }
        sc.close();
    }
}
