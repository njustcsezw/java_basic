package njustz.leetcode;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符
 * 然后输出输入字符串中含有该字符的个数。不区分大小写。
 * @author njustz
 * @date 2020/4/1
 */
public class MainStrContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next().toLowerCase();
            String str2 = scanner.next().toLowerCase();
            char[] ch = str2.toCharArray();
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if(ch[0] == str1.charAt(i))
                    count++;
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
