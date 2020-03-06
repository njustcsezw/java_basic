package njustz.basiclib;

import java.util.Scanner;

public class ScannerKeyBoard {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            System.out.println("input :" + sc.next());
        }

    }
}
