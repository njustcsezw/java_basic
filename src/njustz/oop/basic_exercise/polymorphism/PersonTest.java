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
        man.earn();
        System.out.println("*************");

        //多态性：父类的引用指向子类对象
        //编译期看左边，运行期看右边
        Person p2 = new Man();
        p2.eat();
        p2.walk();
        // p2.earn(); 找不到earn方法，报错
        System.out.println("*************");

    }
}
