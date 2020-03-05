package njustz.oop.basic_exercise;

/**
 * 成员内部类：
 *  1.作为类，可以定义属性，方法，构造器，代码块，内部类，被final,abstract修饰
 *  2.作为外部类的成员，可以调用外部类的成员，被static以及四种权限修饰符修饰
 *
 * @author njustz
 * @date 2020/3/6
 */
public class InnerClassTest {

    public static void main(String[] args) {

        Person2.EE ee = new Person2.EE();
        ee.say();

        Person2 person2 = new Person2();
        Person2.DD dd = person2.new DD();
        dd.say();
        dd.display("display ");

    }

}

class Person2{

    String name = "Person2";

    public void eat(){
        System.out.println("Person2:eat() ");
    }


    //成员内部类
    class DD{
        String name ="DD";
        public DD(){

        }
        public void say(){
            System.out.println("I'm DD~");
            eat();// = Person.this.eat();
        }

        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person2.this.name);
        }
    }

    //静态成员内部类
    static class EE{
        String name;
        public EE(){

        }
        public void say(){
            System.out.println("I'm EE~");
        }

    }

    {
        //局部内部类
        class BB{

        }
    }

    public Comparable method(){

       /* //局部内部类
        class AA implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        return new AA();*/

       return new Comparable() {
           @Override
           public int compareTo(Object o) {
               return 0;
           }
       };

    }

    public Person2(){

        //局部内部类
        class CC{

        }
    }

}