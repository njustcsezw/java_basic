package njustz.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author njustz
 * @date 2020/3/26
 */
public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Person person = new Person(20, "HHH", 001);
        System.out.println(person);
        System.out.println("***********");

        //调用构造器
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(int.class, String.class, int.class);
        Person person1 = constructor.newInstance(21, "HHHH", 002);
        System.out.println(person1);
        System.out.println("***********");

        //调用方法
        Method setAge = personClass.getDeclaredMethod("setAge", int.class);
        setAge.invoke(person, 21);
        System.out.println(person);
        System.out.println("***********");

        //调用私有属性
        Field age = personClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person, 22);
        System.out.println(person);
    }
}
