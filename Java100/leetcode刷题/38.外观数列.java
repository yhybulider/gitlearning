/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        // 这里要判断之前的一个出现个数的题 特殊情况
        if (n ==1) {
            return "1";
            
        }
    //找到前n个的结果是怎么样的，然后再进行比较
    StringBuffer sb = new StringBuffer();
      String str = countAndSay(n-1);
    //   通过这个结果进行添加结果
    char c='0';//初始化
    int count=0;//初始化，设置重复的个数
    // 遍历上一个数的情况
    for (int i=0;i<str.length();i++){
        c=str.charAt(i);//第i个字符
        count=1;
        while ((i+1)<str.length()&&str.charAt(i+1)==c){
            //这里的i+1是因为两个
            //循环里都有加一，如果不等了就跳出循环，而且此时的i是以这里为标准
            count++;
            i++;
        }
        //添加个数和所对应的字符
        sb.append(count+""+c);
    }
    return sb.toString();
    }

        
    }

// @lc code=end

