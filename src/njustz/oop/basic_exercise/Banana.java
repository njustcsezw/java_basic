package njustz.oop.basic_exercise;

import njustz.oop.basic_exercise.par.Fruit;

public class Banana extends Fruit {

    public static void main(String [] args){
        // 创建Apple对象
        Banana a = new Banana();
        // Apple对象本身没有weight成员变量
        // 因为Apple的父类有weight成员变量，也可以访问Apple对象的weight成员变量
        a.weight = 57;
        a.info();
        a.setWeight(56);
        // 调用Apple对象的info()方法
        a.info();
    }
}
