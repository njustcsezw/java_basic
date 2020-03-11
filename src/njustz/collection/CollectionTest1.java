package njustz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author njustz
 * @date 2020/3/11
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        Collection coll = new ArrayList(); //多态
        coll.add("AA");
        coll.add("BB");
        coll.add(123); //自动装箱
        coll.add(new Date());
        System.out.println(coll.size());
        System.out.println(coll);

        //contains 用的是参数对象对应的equals()比较方法
        //此处即Integer.equals()
        //故自定义类需要重写equals()方法
        Boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println("****************");

        coll.remove(123);
        System.out.println(coll);

        coll.add(123);
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add("CC");
        coll1.add("BB");

        coll.retainAll(coll1);
        System.out.println(coll);

    }

}
