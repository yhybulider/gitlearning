import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        // 直接判断长度进行比较，奇数的就直接报错
        if(s.length()%2 == 1) {
            return false;
        }
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<> ();
        for (Character ch : c) {
//方法1
// Your runtime beats 93 % of java submissions
// Your memory usage beats 61 % of java submissions (34.1 MB)
            // if(ch =='{' || ch =='(' || ch == '[') {
            //     stack.push(ch) ;
            // } else {
            //     if(stack.empty()) {
            //         return false;
            //     }
            //     if( ch == '}' && stack.pop() != '{') {
            //         return false;
            //     }
            //     if( ch == ']' && stack.pop() != '[') {
            //         return false;
            //     }
            //     if( ch == ')' && stack.pop() != '(') {
            //         return false;
            //     }
            // }
//方法2
// Your runtime beats 58.17 % of java submissions
// Your memory usage beats 75.27 % of java submissions (34.1 MB)
            if (ch == '(')
			stack.push(')');
		else if (ch == '{')
			stack.push('}');
		else if (ch == '[')
            stack.push(']');
            //  先判断是否为空，这里直接是将右边括号和栈顶元素相比较
		else if (stack.isEmpty() || stack.pop() != ch)
			return false;
           
        }
        return stack.empty();
    }
}
// @lc code=end

