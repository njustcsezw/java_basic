package njustz.leetcode;

import java.util.Scanner;

/**
 * Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，
 * 但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。
 * 比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214
 * 因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式）
 * 返回有效密码串的最大长度
 * @author njustz
 * @date 2020/4/12
 */
public class MainPasswordJiequ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = "";
            for (int i = str1.length()-1; i >=0; i--) {
                str2 += str1.charAt(i);
            }
            System.out.println(passwordJiequ2(str1));
          /*  int count1 = passwordJiequ1(str1);
            int count2 = passwordJiequ1(str2);
            System.out.println(count1+" " + count2);*/
           /* if(count1>count2){
                System.out.println(count1);
            }else {
                System.out.println(count2);
            }*/
        }
    }

    /*static int passwordJiequ(String str){
        String str1 = str;
        String str2 = "";
        int count = 0;
        for (int i = str1.length()-1; i >=0; i--) {
            str2 += str1.charAt(i);
        }
        for (int i = 0; i < str.length()-1; i++) {
            String str3 = str1.substring(i+1, str.length());
            String str4 = str2.substring(0,str.length()-i);
            if(str3.equals(str4)){
                count = str3.length();
                return count;
            }
        }
        return count;
    }*/

    /*static int passwordJiequ(String string, int index){
        int count = 0;
        for (int i = index; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                boolean isFlag = false;
                if(string.charAt(i) == string.charAt(j)){
                    isFlag = true;
                    i++;
                    j--;
                    count += 2;
                    if(i==j){
                        count++;
                        int temp =passwordJiequ(string, i);
                        return count > temp? count:temp;
                    }
                    if(i==j+1){
                        //count += 2;
                        int temp = passwordJiequ(string, i-1);
                        return count;
                    }
                    j--;
                }
                if(count>0 && !isFlag){
                    count = 0;
                }
            }
        }
        return count;
    }*/

    /*static int passwordJiequ1(String string){
        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            for (int j = string.length()-1; j >i; j--) {
                boolean isFlag = false;
                if(string.charAt(i) == string.charAt(j)){
                    isFlag = true;
                    i++;
                    j--;
                    count += 2;
                    if(i==j){
                        return count;
                    }
                    if(i==j+1){
                        return count;
                    }
                    j++;
                }
                if(count>1 && !isFlag){
                    count = 1;
                }
            }
        }
        return count;
    }*/

    static int passwordJiequ2(String string){
        int len = string.length();
        if(len == 1){
            return 1;
        }
        int maxLen = 0;
        for (int i = 1; i < len; i++) {
            int low = i-1;
            int high = i;
            while (low>=0 && high<len && string.charAt(low)==string.charAt(high)){
                low--;
                high++;
            }

            if(high-low-1 >maxLen)
                maxLen = high-low-1;

            low = i -1;
            high = i+1;
            while (low>=0 && high<len && string.charAt(low)==string.charAt(high)){
                low--;
                high++;
            }

            if(high-low-1 >maxLen)
                maxLen = high-low-1;
        }
        return maxLen;
    }
}
