package njustz.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author njustz
 * @date 2020/3/12
 */
public class GenericTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("abc"); //Object

        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        arrayList.add(78); //Integer

        //迭代器遍历集合元素
        //越界会报NoSuchElement异常
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
