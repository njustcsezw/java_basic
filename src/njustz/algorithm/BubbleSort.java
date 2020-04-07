package njustz.algorithm;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 对比selectSort，80000随机数组排序
 * 11s vs 2s
 * 因为selectSort交换数据过程较少
 * @author njustz
 * @date 2020/2/26
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 13, -61, 65, 78, 16, 13, 0, -20, 10};

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("after:" + Arrays.toString(arr));

        int[] arr1 = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr1[i] = (int) ((Math.random()*80000)+1);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date1));

        bubbleSort(arr1);

        Date date2 = new Date();
        System.out.println(simpleDateFormat.format(date2));


    }

    public static void bubbleSort(int[] arr){
        boolean flag = false;
        int temp;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                break;
            }else{
                flag = false;
            }
        }
    }
}
