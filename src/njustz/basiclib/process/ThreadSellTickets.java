package njustz.basiclib.process;

/**
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

    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":买票，票号为： " + ticket);
                ticket --;
            }else {
                break;
            }
        }
    }
}
