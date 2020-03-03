class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        // 如果目标字符串为空 返回0
        if (needleChar.length == 0) {
            return 0;
        }
        // 遍历源字符串
        for (int i = 0; i < haystackChar.length; i++) {
            // 判断当前字符是否和目标第一个字符相同
            if (haystackChar[i] == needleChar[0]) {
                // 如果源字符当前索引后面的长度没有目标字符串长 则不匹配,跳过当前循环
                if (i + needleChar.length > haystackChar.length) {
                    continue;
                }
                // 遍历目标字符串, 和源字符串当前索引位置的字符串开始对比 都想同则return
                for (int j = 0; j < needleChar.length; j++) {
                    result = i;
                    if (haystackChar[i + j] != needleChar[j]) {
                        result = -1;
                        break;
                    }
                }
                if (result > -1) {
                    return result;
                }                                                                                                                                                                                                                                                                                                                                                            
            }
        }
        return result;
    }
} //  leetcode英文板上的一位老哥答案
//  Your runtime beats 25.08 % of java submissions
// Your memory usage beats 95.91 % of java submissions (36.1 MB)
// for (int i = 0; ; i++) {
//     for (int j = 0; ; j++) {
//         if (j  == needle.length()) {
//             return i;
//         }
//         if (i + j == haystack.length()) {
//             return -1;
//         }
//         if (haystack.charAt(i+j) != needle.charAt(j)) {
//             break;
//         }
//     }
// }
