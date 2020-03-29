package njustz.basiclib.process;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author njustz
 * @date 2020/3/29
 */

class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2 ==0){
                System.out.print(" " + i);
                sum += i;
            }
        }
        System.out.println();
        return sum;
    }
}

public class ThreadCallableTest {
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new NumThread());
        new Thread(futureTask).start();
        Object sum = null;
        try {
            sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
