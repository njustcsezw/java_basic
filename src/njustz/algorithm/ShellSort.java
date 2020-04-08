package njustz.algorithm;

import java.util.Arrays;

/**
 * @author njustz
 * @date 2020/4/8
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6 , 0};
        shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void shellSort(int[] arr){
        for(int gap = arr.length/2; gap>0; gap /=2){
            int temp = 0;
            for (int i = gap; i < arr.length; i++) {
                for (int j = i-gap; j >=0 ; j -=gap) {
                    if(arr[j] > arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }
            }
        }

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
