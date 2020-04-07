package njustz.algorithm;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 简单选择排序
 * @author njustz
 * @date 2020/4/8
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        System.out.println("before:" + Arrays.toString(arr));
        selectSort(arr);
        System.out.println("after:" + Arrays.toString(arr));

        int[] arr1 = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr1[i] = (int) ((Math.random()*80000)+1);
        }
        long timeMillis1 = System.currentTimeMillis();
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date1));
        selectSort(arr1);
        long timeMillis2 = System.currentTimeMillis();
        Date date2 = new Date();
        System.out.println(simpleDateFormat.format(date2));
        System.out.println(((timeMillis2 - timeMillis1) / 1000));

    }

    static void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1 ; j < arr.length; j++) {
                if(min>arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

        }
    }
}
