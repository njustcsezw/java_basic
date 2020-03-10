package njustz.basiclib.string;


/**
 * String, StringBuffer, StringBuilder三者之间效率测试
 * @author njustz
 * @date 2020/3/10
 */
public class StringTest3 {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String消耗时间: " +(endTime-startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer消耗时间: " +(endTime-startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder消耗时间: " + (endTime-startTime));


    }
}
