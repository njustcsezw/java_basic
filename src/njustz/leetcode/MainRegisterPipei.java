package njustz.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author njustz
 * @date 2020/4/15
 */
public class MainRegisterPipei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            String register = scanner.next();
            String[] infs = register.split(",");
            int[] next = kmpNext(str);
            int[] nextAddr = kmpNext(str+"[addr=");
            int[] nextMask = kmpNext(",mask=");
            int[] nextVal = kmpNext(",val=");
            ArrayList arrayList = new ArrayList();

            for (int i = 0; i < infs.length; i++) {
                int a = kmp(infs[i], str, next);
                if(a!= -1){
                    int addr = kmp(infs[i],str+"[addr=", nextAddr);
                    if(addr!=-1){
                        int mask = kmp(infs[i],str+",mask=", nextMask);
                        if(mask!=-1){
                            int val = kmp(infs[i],str+",mask=", nextVal);
                            if(val!=-1){
                                arrayList.add(infs[i].substring(str.length()+5, mask));
                                arrayList.add(infs[i].substring(mask+6, val));
                                arrayList.add(infs[i].substring(val+5));

                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }else {
                        break;
                    }
                }else {
                    break;
                }
            }
            if(arrayList.size()!=0){
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.print(arrayList.get(i)+ " ");
                    if(i/3 == 0){
                        System.out.println();
                    }
                }
            }

        }

    }

    //返回部分匹配表
    static int[] kmpNext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;

        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j>0 && dest.charAt(i)!= dest.charAt(j)){
                j=next[j-1];
            }
            if(dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }

        return next;
    }

    static int kmp(String str1, String str2, int[] next){
        for (int i = 0, j = 0; i < str1.length(); i++) {

            while (j>0 && str1.charAt(i) != str2.charAt(j)){
                j = next[j-1];
            }

            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
            if(j == str2.length()){
                return i-j+1;
            }
        }
        return -1;
    }

}
