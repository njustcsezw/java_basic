package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/13
 */
public class MainAniaml {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n+1];
            int[] count = new int[n+1];
            for (int i = 0; i < b.length; i++) {
                b[i] = 0;
                count[i] = 1;
            }

            for (int i = 1; i <=n ; i++) {
                int index=i;
                if(a[index] == 0){
                    b[index]++;
                }else {
                    while (a[index]!=0){
                        b[index]++;
                        if(a[index] == index)
                            break;
                        index = a[index];
                    }
                }
            }

            for (int i = 1; i <=n ; i++) {
                System.out.println(b[i]);
            }

        }
    }

    static int[] select(int[] a){
        int[] select = new int[a.length];
        for (int i = 0; i < select.length; i++){
                select[i]++;
        }

        return select;
    }
}
