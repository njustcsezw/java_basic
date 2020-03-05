package njustz.pattern_design;

/**
 * @author njustz
 * @date 2020/3/5
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template template = new SubTemplate();
        template.spendTime();
    }

}

abstract class Template{

    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("the cost of time is: " + (end-start));
    }

    public abstract void code();

}

class SubTemplate extends Template{

    @Override
    public void code() {
        //output prime between 2~1000
        for(int i = 2; i < 1000; i++){
            boolean isFlag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
