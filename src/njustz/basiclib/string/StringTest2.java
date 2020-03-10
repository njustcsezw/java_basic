package njustz.basiclib.string;

/**
 * StringBuffer与StringBuilder的使用
 * @author njustz
 * @date 2020/3/10
 */
public class StringTest2 {

    public static void main(String[] args) {

        StringBuffer stringBuffer1 = new StringBuffer();
        //char[] value = new char[16];
        stringBuffer1.append("abc");
        System.out.println(stringBuffer1);

        StringBuffer stringBuffer2 = new StringBuffer("abc");
        //char[] value = new char["abc".length + 16]
        System.out.println("stringBuffer1 == StringBuffer2?" + (stringBuffer1 == stringBuffer2));


    }
}
