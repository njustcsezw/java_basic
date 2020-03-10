package njustz.basiclib.string;

/**
 * String类常用的方法
 * @author njustz
 * @date 2020/3/8
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(5));
        System.out.println(s1.isEmpty());
        String s2 = s1.toUpperCase();
        System.out.println("s2: " + s2);
        System.out.println("s1: " + s1);
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = " he ll world  ";
        String s4 = s3.trim();
        System.out.println("s3: " + s3 + "*");
        System.out.println("s4: " + s4 + "*");

        String s5 = "111222333";
        String s6 = s5.substring(0, 7);
        System.out.println(s6);

    }
}
