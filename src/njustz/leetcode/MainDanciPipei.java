package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/1
 */
public class MainDanciPipei {

    static boolean Jiuzheng(String str1, String str2){
        if(str1.length()-str2.length()>2){
            return false;
        }
        if(str1.length() - str2.length()< -2){
            return false;
        }
        if(str1.length() - str2.length() == 2){
            if(str1.contains(str2)){
                return true;
            }else
                return false;
        }
        if(str1.length() - str2.length() == -2){
            if(str2.contains(str1)){
                return true;
            }else
                return false;
        }
        if(str1.length() - str2.length() == 1){
            if(str1.contains(str2)){
                return true;
            }
        }

        if(str1.length() - str2.length() == 0){
            if(str1.contains(str2)){
                return true;
            }
        }

        if(str1.length() - str2.length() == -1){
            if(str2.contains(str1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[]{"surprise", "happy", "ctrip", "travel", "wellcome", "student",
                "system", "progarm", "editor"};
        String str ="";
        boolean isFlag = false;
        while (scanner.hasNext()){
            str = scanner.next();
            for (int i = 0; i < strings.length; i++) {
                isFlag = Jiuzheng(strings[i],str);
                if (isFlag){
                    System.out.println(strings[i]);
                    break;
                }
            }
            System.out.println("null");
        }
        scanner.close();
    }
}
