package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/1
 */
public class MainKeFu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String strc = scanner.nextLine();
            int count = Integer.parseInt(strc);
            int[][] times = new int[count][2];
            for (int i = 0; i < count; i++) {
                String str = scanner.nextLine();
                String[] split = str.split(",");
                times[i][0] = Integer.parseInt(split[0]);
                times[i][1] = Integer.parseInt(split[1]);
            }
            int c = count;
            for (int i = 0; i < c-1; i++) {
                for (int j = i+1; j < c; j++) {
                    if(times[i][1]<=times[j][0]){
                        count--;
                        times[i][1] = times[j][1];
                    }

                }
            }
            if(count<=0){
                System.out.println(1);
            }
            else {
                System.out.println(count);
            }
        }
        scanner.close();
    }
}
