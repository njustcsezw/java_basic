package njustz.leetcode;


import java.util.Scanner;

/**
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶
 * 方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * @author njustz
 * @date 2020/3/29
 */
public class SodaBottle {
    public static int count(int a){
        int temp = 0;
        int rest = 0;
        int k = a;
        while (k != 0) {
            if (k == 1) {
                break;
            }
            if (k == 2) {
                temp++;
                break;
            }
            temp += k / 3;
            rest = k % 3;
            k = rest + k / 3;
        }
        return temp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            if(num != 0){
                System.out.println(count(num));
            }
        }

    }
}
