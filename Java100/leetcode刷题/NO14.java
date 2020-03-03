//package music.ShuaTi;

/**
 * 第十四道题
 * @date 1/27
 * title：
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 */
public class NO14 {
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        longestCommonPrefix(s);

    }
    /*public static void longestCommonPrefix(String[] strs) {
        for (int i =0;i < strs.length;i++){
            byte[] b = strs[i].getBytes();
            byte[] a = strs[i+1].getBytes();

            for (int j =0; j < b.length; j++){
                if (a[j] == b[j]){

                    System.out.println(String.valueOf(a[j]));

                }

            }*/
//        }

//    }
public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0  ) return "";
    String reg = strs[0];
    for (String str : strs){
        //测试是否以指定前缀开头
        while (!str.startsWith(reg)) {
            if (reg.length() == 1) {
                return "";
            }
            //判断然后每次都从最后一个字母开始递减，相拼接在一起
            reg = reg.substring(0, reg.length()-1);
        }
    }
    return reg;
}
}
