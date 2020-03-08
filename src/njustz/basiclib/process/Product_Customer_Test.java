package njustz.basiclib.process;

import njustz.oop.basic_exercise.polymorphism.Person;

import java.util.SortedMap;

/**
 * @author njustz
 * @date 2020/3/8
 */
public class Product_Customer_Test {
    public static void main(String[] args) {

        Store store = new Store();
        Product product = new Product(store);
        product.setName("producer");

        Thread thread = new Thread(new Customers(store),"custmoers");

        product.start();
        thread.start();

    }
}


class Product extends Thread{

    private Store store;

    public Product(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        System.out.println(getName() + "：开始生产产品...");
        while (true){
            store.add();
        }

    }
}

class Customers implements Runnable{

    private Store store;

    public Customers(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 开始消费产品...");
        while (true){
            store.decrease();
        }

    }
}

class Store{
    private int productNum = 0;

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public synchronized void add(){
        if(productNum < 20){
            System.out.println(Thread.currentThread().getName() + ": 开始生产第" + (productNum + 1) + "个产品");
            this.productNum++;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void decrease(){
        if(productNum > 0){
            System.out.println("开始消费第" + productNum + "个产品");
            this.productNum--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}