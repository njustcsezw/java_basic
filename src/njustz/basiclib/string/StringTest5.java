package njustz.basiclib.string;

/**
 * 获取两个字符串中的最大相同子串
 * @author njustz
 * @date 2020/3/10
 */
public class StringTest5 {

    public static String getMaxSameString(String str1, String str2){
        String maxStr = (str1.length() >= str2.length())? str1:str2;
        String minStr = (str1.length() < str2.length())? str1:str2;
        int length = minStr.length();
        for (int i = 0; i < length; i++) {
            for(int x = 0,y = length-i;y<=length;x++,y++){
                String subStr = minStr.substring(x, y);
                if(maxStr.contains(subStr)){
                    return subStr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str1 = "abcwerhellodef";
        String str2 = "cvhellobnm";
        System.out.println(StringTest5.getMaxSameString(str1,str2));
    }

}
