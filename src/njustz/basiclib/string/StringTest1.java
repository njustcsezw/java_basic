package njustz.basiclib.string;

import java.util.Arrays;
import java.util.logging.SocketHandler;

/**
 * String类常用的方法
 * @author njustz
 * @date 2020/3/9
 */
public class StringTest1 {
    public static void main(String[] args) {

        String tel = "0571-4534289";
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);

        System.out.println("*****************");
        String str = "hello|world|java";
        String[] strings = str.split("\\|");
        for (String str1 :strings){
            System.out.println(str1);
        }

        String num = "123";
        int num1 = Integer.parseInt(num);
        String num2 = String.valueOf(num1);

        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println(num);
        System.out.println("*******************");

        String byte1 = "abc123";
        byte[] bytes = byte1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(Arrays.toString(bytes));

    }

}
