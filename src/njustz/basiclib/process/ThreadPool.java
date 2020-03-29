package njustz.basiclib.process;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author njustz
 * @date 2020/3/29
 */

class NumThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

class NumThread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        //execute对应Runnable submit对应Callable
        service.execute(new NumThread2());
        service.execute(new NumThread2());
        service.execute(new NumThread3());
        //service.submit(new NumThread());
        //close pool
        service.shutdown();
    }
}
