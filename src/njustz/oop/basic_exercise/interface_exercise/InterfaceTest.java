package njustz.oop.basic_exercise.interface_exercise;

/**
 *类可以多实现接口，并且接口直接支持多继承
 * 接口中变量省略public static final
 * 其中方法省略public abstract
 * @author njustz
 * @date 2020/3/5
 */


public class InterfaceTest {
}

interface Flyable{
    void fly();
}

interface Attackable{
    void attack();
}

class Bullet extends Object implements Flyable,Attackable,CC{
    @Override
    public void fly() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

interface AA{
    void method1();
}

interface BB{
    void method2();
}
interface CC extends AA,BB{}