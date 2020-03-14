package njustz.collection;

import java.util.*;

/**
 * ArrayList
 * @author njustz
 * @date 2020/3/12
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123); //自动装箱
        coll.add(new Date());
        System.out.println(coll.size());
        System.out.println(coll);
        System.out.println("**********");

        int index = coll.indexOf("AA");
        System.out.println(index);
        coll.remove(2);
        System.out.println(coll);
        coll.add(2,123);
        System.out.println(coll);
        coll.set(2,234);
        System.out.println(coll);

        //遍历
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Object list:coll){
            System.out.println(list);
        }

        for (int i = 0; i < coll.size(); i++) {
            System.out.println(coll.get(i));
        }

    }
}
