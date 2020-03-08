package njustz.basiclib.process;

/**
 * @author njustz
 * @date 2020/3/7
 */
public class ThreadSellTickets1 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();

        Thread thread = new Thread(myThread3, "myThread1 ");
        Thread thread1 = new Thread(myThread3, "myThread2 ");
        Thread thread2 = new Thread(myThread3, "myThread3 ");

        thread.start();
        thread1.start();
        thread2.start();

    }

}

class MyThread3 implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {

        while (true) {
            show();

        }
    }

    private synchronized void show(){ //同步监视器是this
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":买票，票号为： " + ticket);
            ticket--;
        }
    }
}

