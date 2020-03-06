package njustz.basiclib.exception;

/**
 * @author njustz
 * @date 2020/3/6
 */

public class ExceptionTest1 {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
            /*int[] arr = new int[10];
            System.out.println(arr[10]);*/
        }catch (Exception e){
            e.printStackTrace();
        }
        //即使catch中有异常，try/catch中有return，finally仍然会被执行
        finally {
            System.out.println("finally cool~");
        }


    }
}
