package njustz.basiclib.string;


/**
 * 返回相同子串数目
 * @author njustz
 * @date 2020/3/10
 */
public class StringTest4 {

    public static int getCount1(String mainStr, String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index;
        if(mainLength >= subLength){
            while ((index = mainStr.indexOf(subStr)) != -1){
                count++;
                mainStr = mainStr.substring(index + subStr.length());
            }
            return count;
        }else {
            return 0;
        }
    }

    public static int getCount2(String mainStr, String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if(mainLength >= subLength){
            while ((index = mainStr.indexOf(subStr, index)) != -1){
                count++;
                index += subLength;
            }
            return count;
        }else {
            return 0;
        }
    }

    public static int getCount3(String mainStr, String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index;
        if(mainLength >= subLength){
            String string = mainStr.replace(subStr,"");
            int strLength = string.length();
            count = (mainLength-strLength)/subLength;
            return count;
        }else {
            return 0;
        }
    }


    public static void main(String[] args) {
        String str1 = "absdfabsdkabjlab";
        String str2 = "ab";
        int count1 = StringTest4.getCount1(str1, str2);
        int count2 = StringTest4.getCount2(str1, str2);
        int count3 = StringTest4.getCount3(str1, str2);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }

}
