package njustz.generic;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

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
    }
}
