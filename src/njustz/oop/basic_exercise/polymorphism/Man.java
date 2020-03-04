package njustz.oop.basic_exercise.polymorphism;

/**
 * @author njustz
 * @date 2020/3/4
 */
public class Man extends Person {
    boolean isSmoking;

    public void earn(){
        System.out.println("Man.earn() ");
    }

    @Override
    public void eat() {
        System.out.println("Man.eat() ");
    }

    @Override
    public void walk() {
        System.out.println("Man.walk() ");
    }
}
