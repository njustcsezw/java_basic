package njustz.basiclib.process;

/**
 * 使用synchronized方式解决线程安全问题
 * @author njustz
 * @date 2020/3/7
 */
public class ThreadSellTickets {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();

        Thread thread = new Thread(myThread2, "myThread1 ");
        Thread thread1 = new Thread(myThread2, "myThread2 ");
        Thread thread2 = new Thread(myThread2, "myThread3 ");

        thread.start();
        thread1.start();
        thread2.start();

    }

}

class MyThread2 implements Runnable{
    private static int ticket = 100;

    //Object object = new Object();

    @Override
    public void run() {

            while (true) {
                synchronized (this) {
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
                }
            }
    }
}
