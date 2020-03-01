package njustz.oop.basic_exercise;

public class Cow {

    private double weight;

    public Cow(){}

    public Cow(double weight){
        this.weight = weight;
    }

    private  class CowLeg{

        private double length;
        private String color;

        public CowLeg(){}

        public CowLeg(double length , String color)
        {
            this.length = length;
            this.color = color;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void info(){
            System.out.println("当前牛腿颜色是："
                    + color + ", 高：" + length);
            // 直接访问外部类的private修饰的成员变量
            System.out.println("本牛腿所在牛重：" + weight);
        }
    }

    public void test(){
        CowLeg cl = new CowLeg(1.45,"black");
        cl.info();
    }

    public static void main(String[] arg){
       Cow cow = new Cow(400);
       cow.test();
    }

}
