package njustz.collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author njustz
 * @date 2020/3/17
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(355);
        treeSet.add(345);
        treeSet.add(456);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
