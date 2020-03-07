package njustz.basiclib.process;

/**
 * 线程的创建方式2
 * 实现Runnable接口，并重写run()方法
 * 创建实现类的对象传入Thread类构造器中，创建Thread类对象
 * 使用该对象调用start()
 * @author njustz
 * @date 2020/3/7
 */
public class ThreadTest1 {

    public static void main(String[] args) {

        //创建实现类的对象传入Thread类构造器中，创建Thread类对象
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1, "myThread1");
        thread.start();

        //再启动一个线程
        Thread thread1 = new Thread(myThread1);
        thread1.setName("myThread2");
        thread1.start();

    }

}


//实现Runnable接口，并重写run()方法
class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName() + " " + i + " ");
            }

        }
        System.out.println();
    }
}