package njustz.algorithm;

/**
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

        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}
