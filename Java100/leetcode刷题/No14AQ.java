

import java.util.Arrays;

/**
 * 收集b站上的14题答案
 * 难点关键点在于只比较第一个和最后一个字符串
 */
public class No14AQ {
    public static void main(String[] args) {
        String[] s = {"flower","fsow","flight"};
        System.out.println(longestCommonPrefix(s));
    }

    /**
     * @param strs 输入的字符穿数组
     * @return 字符串的长度
     */
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0){
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
//        定义出最大的限制长度，就是最后输出的共同字符是多少个
        int limit = Math.min(first.length(),last.length());
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < limit; i++){
            if (first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }

}
