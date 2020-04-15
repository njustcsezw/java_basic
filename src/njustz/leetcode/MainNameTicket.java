package njustz.leetcode;

import java.util.*;

/**
 * @author njustz
 * @date 2020/4/15
 */
public class MainNameTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String name = scanner.nextLine();
            String[] names = name.split(",");
            //int[] tickets = new int[names.length];
            TreeMap<String,Integer> hashMap = new TreeMap<>();

            for (int i = 0; i < names.length; i++) {
                hashMap.put(names[i],hashMap.getOrDefault(names[i],0)+1);
            }

            int result = 0;
            for(String key:hashMap.keySet()){
                if(hashMap.get(key) > result){
                    result = hashMap.get(key);
                }
            }

            String[] maxName = new String[names.length];
            int i = 0;
            for(String key:hashMap.keySet()){
                if(hashMap.get(key) == result){
                    maxName[i] = key;
                    i++;
                }
            }

            System.out.println(maxName[0]);
        }
    }

}
