package njustz.algorithm;

/**
 * @author njustz
 * @date 2020/4/10
 */
public class ZHanoiTower {
    public static void main(String[] args) {
        hanoiTower(5,'A','B', 'C');
    }
    static void hanoiTower(int num, char a, char b, char c){
        if(num==1){
            System.out.println("1: " + a + "->" + c);
        }else {
            hanoiTower(num-1, a, c, b);
            System.out.println(num+": " + a + "->" + c);
            hanoiTower(num-1, b, a, c);
        }
    }
}
