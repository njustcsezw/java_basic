package njustz.leetcode;

import java.util.Scanner;

/**
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * @author njustz
 * @date 2020/4/13
 */
public class MainStringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            String[] strings = cut(str);
            for(String string:strings){
                System.out.println(string);
            }
        }
    }

    static String[] cut(String str){
        int n = str.length()/8;
        int m = str.length()%8;
        String[] strings;
        if(m!= 0){
            strings = new String[n+1];
            for (int i = 0; i < n; i++) {
                strings[i] = str.substring(8*i, 8*(i+1));
            }
            String left = str.substring(8*n);
            int num = left.length();
            strings[n] = left;
            for (int i = num; i < 8; i++) {
                strings[n] += "0";
            }
        }else {
            strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = str.substring(8*i, 8*(i+1));
            }
        }
        return strings;
    }
}
