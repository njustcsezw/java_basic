package njustz.oop.basic_exercise.polymorphism;

/**
 * @author njustz
 * @date 2020/3/4
 */
public class Woman extends Person {

    boolean isBeauty;

    public void goShopping(){
        System.out.println("Woman.goShopping() ");
    }

    @Override
    public void eat() {
        System.out.println("Woman.eat() ");
    }

    @Override
    public void walk() {
        System.out.println("Woman.walk() ");
    }
}
