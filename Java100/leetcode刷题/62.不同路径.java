/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        // DP algorithms
        // new array[]
        int[][] dp = new int[m][n];
        // special situation
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                if (i == 0 || j == 0) {
                     dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                
            }
            // 从小的开始，定义新的数组，每次都要加上先前的结果
        }
        return dp[m-1][n-1];

    }
}
// 还可以使用排列组合的方式去做
// (n+m-2,min(n-1,m-1))
// @lc code=end

