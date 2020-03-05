package njustz.pattern_design;

/**
 * 单例设计模式: 某个类中只能存在一个对象实例
 * @author njustz
 * @date 2020/3/5
 */
public class SingletonTest{
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }

}

//饿汉式
class Bank{

    //2.内部创建类的对象
    private static Bank instance = new Bank();

    //1.私有化构造器
    private Bank(){
    }

    //3.提供公共的静态方法，返回对象
    public static Bank getInstance(){
        return instance;
    }

}

//懒汉式
class Black{

    //2.声明当前类对象，没有初始化
    private static Black black = null;

    //1.私有化构造器
    private Black(){

    }

    //3.初始化对象
    public static Black getInstance(){
        if(black == null){
            black = new Black();
        }
        return black;
    }

}
