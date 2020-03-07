package njustz.basiclib.process;

/**
 * 线程的创建方式1
 * 继承Thread,重写run()方法
 * 创建子类对象，调用start()方法
 * @author njustz
 * @date 2020/3/6
 */

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.print(Thread.currentThread().getName() + i + " ");
            }

        }
        System.out.println();
    }

}

public class ThreadTest{
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(Thread.currentThread().getName() + "hello~ ");
        }
    }
}
