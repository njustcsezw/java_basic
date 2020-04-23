package njustz.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/22
 */
public class MainDatagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            String[] strings = input.split(" ");

            boolean isFirst = strings[0].equals("5a")? true:false;
            boolean isTransfer = false;
            int num = 0;
            ArrayList total = new ArrayList();
            ArrayList totalCompare = new ArrayList();
            for (int i = 1; i < strings.length; i++) {
                if(!isFirst && strings[i].equals("5a")){
                    isFirst = true;
                    continue;
                }
                if(strings[i].equals("5b")&&
                        (strings[i+1].equals("ba")|| strings[i+1].equals("bb"))&&
                        (i < strings.length-1)){
                    isTransfer = true;
                    continue;
                }

                if( isFirst && isTransfer &&
                        (strings[i+1].equals("ba")|| strings[i+1].equals("bb"))&&
                        (i < strings.length-1)){
                    num ++;
                    isTransfer = false;
                    continue;
                }
                if(isFirst && strings[i].equals("5a")){
                    total.add(num-1);
                    totalCompare.add(Integer.valueOf(strings[i-1]));
                    num = 0;
                    continue;
                }
                num++;
            }

            String[] strings1 = input.split("5a");
            //System.out.println("1" + strings1[0] +"1");
            String result = "5a";
            for (int i = 0; i < total.size(); i++) {
                if(total.get(i) == totalCompare.get(i)){
                    result += strings1[i+1];
                    result += "5a";
                }
            }
            System.out.println(result);
        }
    }
}
