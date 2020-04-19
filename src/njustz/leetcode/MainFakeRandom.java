package njustz.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/16
 */
public class MainFakeRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();
            ArrayList arrayList = new ArrayList();
            while (true){
                x =  (a*x +b)%m;
                if(arrayList.contains(x) && arrayList.contains((a*x +b)%m)){
                    break;
                }
                arrayList.add(x);

            }
            System.out.println(arrayList.size());
        }
    }
}
