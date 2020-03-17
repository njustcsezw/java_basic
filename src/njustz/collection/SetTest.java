package njustz.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author njustz
 * @date 2020/3/14
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(123);
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add(456);
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set set1 = new LinkedHashSet();
        set1.add(123);
        set1.add("AA");
        set1.add("BB");
        set1.add("CC");
        set1.add(456);
        System.out.println(set1);
    }
}
