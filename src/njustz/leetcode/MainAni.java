package njustz.leetcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/13
 */
public class MainAni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            a[0] = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 1; i < n+1; i++) {
                map.put(i, 1);
            }


            for (int i = 1; i < n+1; i++) {
                if(a[i] != 0){
                    int index = a[i];
                    while (index != 0){
                        map.put(index, map.get(index)+1);
                        index = a[index];
                    }
                }
            }

            for(int i:map.keySet()) {
                if (i == 0)
                    continue;
                System.out.println(map.get(i));
            }
           /* HashMap<Integer,Integer> map = select(a);
            for(int i:map.keySet()){
                if(i == 0)
                    continue;
                System.out.println(map.get(i));
            }*/

        }
    }

   /* static HashMap<Integer,Integer> select(int[] a){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i <= a.length-1 ; i++) {
            map.put(i, 1);
        }
        for (int i = 0; i <= a.length-1 ; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);

        }
        return map;
    }*/
}
