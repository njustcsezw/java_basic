package njustz.oop.basic_exercise;

public class Primitive2String {
    public static void main(String[] args){
        String intStr = "123";
        int it1 = Integer.parseInt(intStr);
        int it2 = Integer.valueOf(intStr);
        System.out.println(it2);

        String floatStr = "4.56";
        // 把一个特定字符串转换成float变量
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = Float.valueOf(floatStr);
        System.out.println(ft2);

        String ftStr = String.valueOf("2.345f");
        String boolStr = String.valueOf(true);
        System.out.println(ftStr);
        System.out.println(boolStr);
    }
}
