package njustz.oop.basic_exercise.polymorphism;

/**
 * @author njustz
 * @date 2020/3/4
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        p1.walk();
        System.out.println("*************");

        Man man = new Man();
        man.eat();
        man.walk();
        System.out.println("*************");

        //多态性：父类的引用指向子类对象
        Person p2 = new Man();
        p2.eat();
        p2.walk();
        System.out.println("*************");

    }
}
