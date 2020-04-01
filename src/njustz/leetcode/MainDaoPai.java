package njustz.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 对字符串中的所有单词进行倒排。
 * 说明：
 * 1、每个单词是以26个大写或小写英文字母构成；
 * 2、非构成单词的字符均视为单词间隔符；
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * 4、每个单词最长20个字母；
 * @author njustz
 * @date 2020/4/1
 */
public class MainDaoPai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            ArrayList<String> stringList= new ArrayList<>();
            String str1 = "";
            //boolean isFlag;
            for (int i = 0; i < str.length(); i++) {
                if(('A'<=str.charAt(i)&&str.charAt(i)<='Z')||('a'<= str.charAt(i)&&str.charAt(i)<='z')){
                    str1 += str.charAt(i);
                }else {
                    if(str1 != ""){
                        stringList.add(str1);
                        str1 = "";
                    }
                }

            }

            if(('A'<=str.charAt(str.length()-1)&&str.charAt(str.length()-1)<='Z')
                    ||('a'<= str.charAt(str.length()-1)&&str.charAt(str.length()-1)<='z'))
                stringList.add(str1);

            //System.out.println(stringList.size());

            for (int i = stringList.size()-1; i >=0; i--) {
                if(i == 0){
                    System.out.print(stringList.get(i));
                    break;
                }
                System.out.print(stringList.get(i) + " ");
            }
        }
        scanner.close();
    }
}
