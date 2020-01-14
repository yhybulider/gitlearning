  //整数反转 输入982 输出289
  // 解法1一
  
 int term;
 long b = 0;//这里题目是说32位int数据，但是楼主机智，将其设置为long型
    while (x != 0) {
        term = x % 10;
        x = x / 10;
        b = b*10 + term;
    }
    if(b > Integer.MAX_VALUE || b < Integer.MIN_VALUE) {
        return 0;
    }
    return (int) b;  
	
	// 解法二
class Solution {
public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) 
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) 
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }
}
// 解法三

class Solution {
    public int reverse(int x) {
       long rs = 0;
       while(x != 0){
           rs = rs*10+x%10;
           x/=10;
       }
       return(rs<Integer.MIN_VALUE || rs>Integer.MAX_VALUE)?0:(int)rs;
    }
}