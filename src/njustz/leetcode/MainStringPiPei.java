package njustz.leetcode;

import java.util.Scanner;

/**
 * 判断短字符串中的所有字符是否在长字符串中全部出现
 * @author njustz
 * @date 2020/4/12
 */
public class MainStringPiPei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(pipei(str1, str2));
        }
    }

    static boolean pipei(String str1, String str2){
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(Character.toString(str1.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
