package njustz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author njustz
 * @date 2020/3/11
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList(); //多态
        coll.add("AA");
        coll.add("BB");
        coll.add(123); //自动装箱
        coll.add(new Date());
        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");

        coll.add(coll1);

        System.out.println(coll.size());
        System.out.println(coll);
        System.out.println("*************");

        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);
        System.out.println("*************");

    }
}
