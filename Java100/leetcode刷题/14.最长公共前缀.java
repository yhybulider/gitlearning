

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
      
        if(strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        //比较第一个字符串与最后一个字符串
        int i = strs.length;
        String first = strs[0];
        String last = strs[i-1];
        //关键这里排序之后，就只用比较头尾两元素就可以了
        int limit = Math.min(first.length(), last.length());
        //定义一个字符缓冲区进行后续的添加
        StringBuffer sb = new StringBuffer();
        for(int j = 0; j < limit; j++) {
            if(first.charAt(j) == last.charAt(j)) {
                //这里的append方法可以接受char类型的参数
                sb.append(first.charAt(j));
            } else {
                break;
            }

        }
        return sb.toString();
       

        
    }
}
// @lc code=end

