/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
            
        }
        if (s.length()< 2) {
            return s;
        }
        char[] ch = s.toCharArray();
        String output = null; 
        if (s.length()>3) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == ch[i+1] || ch[i] == ch[i+2]) {
                    output += Character.toString(ch[i]);
                    
                }
        }
        }



        return output;

    }
}
// @lc code=end

