package njustz.algorithm;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author njustz
 * @date 2020/4/8
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println("before: " + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("after: " + Arrays.toString(arr));

        int[] arr1 = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr1[i] = (int) ((Math.random()*80000)+1);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date1));

        insertSort(arr1);

        Date date2 = new Date();
        System.out.println(simpleDateFormat.format(date2));

    }

    static void insertSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int insertVal = arr[i+1];
            int insertIndex = i;
            while (insertIndex>=0 && insertVal < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = insertVal;
        }
    }
}
