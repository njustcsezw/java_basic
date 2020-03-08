package njustz.basiclib.process;

import njustz.basiclib.exception.EcDef;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用ReentrantLock方式解决线程安全问题
 * @author njustz
 * @date 2020/3/8
 */
public class ThreadLockTest {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();

        Thread thread = new Thread(myThread4, "myThread1 ");
        Thread thread1 = new Thread(myThread4, "myThread2 ");
        Thread thread2 = new Thread(myThread4, "myThread3 ");

        thread.start();
        thread1.start();
        thread2.start();
    }
}


class MyThread4 implements Runnable{

    private int ticket = 100;

    //实例化ReentrantLock类
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为： " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }


        }

    }
}