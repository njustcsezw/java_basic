package njustz.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/22
 */
public class MainStringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.next();
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < chars.length; i++) {
                if(Character.isDigit(chars[i])){
                    arrayList.add(chars[i]);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i));
            }
        }
    }
}
