package njustz.data_structure;

import java.io.*;

/**
 * 稀疏数组与二维数组之间的转换
 * @author njustz
 * @date 2020/4/7
 */
public class SparseArray {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][3] = 2;

        for (int[] item:array){
            for (int a:item){
                System.out.printf("%d\t", a);
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0)
                    sum++;
            }
        }

        //创建对应的稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = array.length;
        sparseArr[0][1] = array[0].length;
        sparseArr[0][2] = sum;
        int a = 1;
        //int b = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0){
                    sparseArr[a][0] = i;
                    sparseArr[a][1] = j;
                    sparseArr[a][2] = array[i][j];
                    a++;
                }
            }
        }
        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < sparseArr[i].length; j++) {
                System.out.print(sparseArr[i][j] + " ");
            }
            System.out.println();
        }

        //恢复为二维数组
        int[][] binaryArray = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 0; i < sparseArr[0][2]; i++) {
            binaryArray[sparseArr[i+1][0]][sparseArr[i+1][1]] = sparseArr[i+1][2];
        }
        for (int[] item:binaryArray){
            for (int b:item){
                System.out.printf("%d\t", b);
            }
            System.out.println();
        }

       /* try {
            FileOutputStream fos = new FileOutputStream(new File("E:\\workCrazyJava\\src\\njustz\\data_structure\\binaryArray.txt"));
            //char[] chars = new char[1024];
            for (int i = 0; i < sparseArr.length; i++) {
                for (int j = 0; j < sparseArr[i].length; j++) {
                    fos.write(sparseArr[i][j]);
                }
                fos.write('\n');
            }

            if(fos!= null){
                fos.close();
            }
            FileInputStream fis = new FileInputStream("E:\\workCrazyJava\\src\\njustz\\data_structure\\binaryArray.txt");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes))!= -1){
                for(byte c:bytes){
                    System.out.print(c);
                }
                System.out.print(" ");
            }

            if(fis != null){
                fos.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }
}
