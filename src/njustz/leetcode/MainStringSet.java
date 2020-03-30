package njustz.leetcode;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 输入一个字符串，求出该字符串包含的字符集合
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出
 * 例如：abcqwerabc
 * 输出：abcqwer
 * @author njustz
 * @date 2020/3/30
 */
public class MainStringSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();

            String str1 = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                boolean isFlag = true;
                for (int j = i-1; j >= 0; j--) {
                    if(str.charAt(i) == str.charAt(j))
                        isFlag = false;
                }
                if(isFlag){
                    str1 += str.charAt(i);
                }
            }
            String str2 = "";
            for (int i = str1.length()-1; i >= 0; i--) {
                str2 += str1.charAt(i);
            }
            System.out.println(str2);

          /*  HashSet set = new HashSet();
            String str3 = "";
            for (int i = 0; i < str.length(); i++) {
                if(set.add(str.charAt(i)))
                    str3 += str.charAt(i);
            }
            System.out.println(str3);*/

        }

    }
}


