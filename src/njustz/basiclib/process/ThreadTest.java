package njustz.basiclib.process;

/**
 * 线程的创建方式1
 * @author njustz
 * @date 2020/3/6
 */

public class ThreadTest extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
    }

}
