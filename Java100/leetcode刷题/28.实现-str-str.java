/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
        private int[] failureFunction(char[] str) {
            int[] f = new int[str.length+1];
            for (int i = 2; i < f.length; i++) {
                int j = f[i-1];
                while (j > 0 && str[j] != str[i-1]) j = f[j];
                if (j > 0 || str[j] == str[i-1]) f[i] = j+1;
            }
            return f;
        }
    
        public int strStr(String haystack, String needle) {
            if (needle.length() == 0) return 0;
            if (needle.length() <= haystack.length()) {
                int[] f = failureFunction(needle.toCharArray());
                int i = 0, j = 0;
                while (i < haystack.length()) {
                    if (haystack.charAt(i) == needle.charAt(j)) {
                        i++; j++;
                        if (j == needle.length()) return i-j;
                    } else if (j > 0) j = f[j];
                    else i++;
                }
            }
            return -1;
        }
   
    }
// @lc code=end
// int result = -1;
// char[] haystackChar = haystack.toCharArray();
// char[] needleChar = needle.toCharArray();
// // 如果目标字符串为空 返回0
// if (needleChar.length == 0) {
//     return 0;
// }
// // 遍历源字符串
// for (int i = 0; i < haystackChar.length; i++) {
//     // 判断当前字符是否和目标第一个字符相同
//     if (haystackChar[i] == needleChar[0]) {
//         // 如果源字符当前索引后面的长度没有目标字符串长 则不匹配,跳过当前循环
//         if (i + needleChar.length > haystackChar.length) {
//             continue;
//         }
//         // 遍历目标字符串, 和源字符串当前索引位置的字符串开始对比 都想同则return
//         for (int j = 0; j < needleChar.length; j++) {
//             result = i;
//             if (haystackChar[i + j] != needleChar[j]) {
//                 result = -1;
//                 break;
//             }
//         }
//         if (result > -1) {
//             return result;
//         }
//     }
// }
// return result;


