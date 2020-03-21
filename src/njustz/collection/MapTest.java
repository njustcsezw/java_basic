package njustz.collection;

import java.util.*;

/**
 * @author njustz
 * @date 2020/3/17
 */
public class MapTest {
    public static void main(String[] args) {

        //System.out.println(1>>2);
        HashMap map = new HashMap();
        map.put(1,1);
        map.put(2, "aa");
        map.put(2, "AA"); //aa被修改成AA
        map.put(3, "bb");
        map.put(4, "cc");
        System.out.println(map);
        System.out.println("**********");
        HashMap map1 = new HashMap();
        map1.put(5, "aa");
        map1.put(6, "bb");
        map1.put(7, "cc");
        System.out.println(map1);
        System.out.println("**********");
        map.putAll(map1);
        System.out.println(map);
        System.out.println("**********");
        System.out.println("remove:" + map.remove(7));
        System.out.println(map);
        System.out.println("**********");

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection values = map.values();
        for(Object obj:values){
            System.out.println(obj);
        }

        Set entrySet = map.entrySet();
        System.out.println(entrySet);
        for (Object obj:entrySet){
            System.out.println(obj);
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
