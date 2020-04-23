package njustz.leetcode;

import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/22
 */
public class MainFindMaxMin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] ints = new int[m];
            //int sum = 0;
            for (int i = 0; i < m; i++) {
                ints[i] = scanner.nextInt();
                //sum += ints[i];
            }

            int a = solve(k, ints);
            int count = 0;
            int tempSum = 0;
            int index = 0;
            for (int i = 0; i < m; i++) {
                tempSum += ints[i];
                if(tempSum >= a){
                    for (int j = index; j <= i; j++) {
                        if(j == i){
                            System.out.print(ints[j]+ " / ");
                        }else {
                            System.out.print(ints[j] + " ");
                        }
                    }
                    index = i+1;
                    tempSum = 0;
                    count++;
                    if(count==k-1){
                        break;
                    }
                }
            }

            for (int i = index; i < m; i++) {
                if(i == m-1){
                    System.out.print(ints[i]);
                }else{
                    System.out.print(ints[i] + " ");
                }
            }

        }
    }

    static int left(int mid, int[] a){
        int left = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if(sum >= mid){
                sum = 0;
                left++;
            }
        }
        return left;
    }

    static int solve(int k, int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int l = 0;
        //int r = (int)1e9;
        int r = sum;
        while (l<r){
            int mid = (l+r)/2;
            if(left(mid, a) >= k){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        if(left(l, a) < k){
            l--;
        }
        return l;
    }
}
