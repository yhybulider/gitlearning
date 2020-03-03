/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        //special
        if (nums.length == 1) {
            return nums[0];
        }
        //DP algorithms
        //new int[]
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = nums[i] > nums[i] + dp[i-1] ? nums[i] : nums[i] + dp[i-1];
            if (max < dp[i]) {
                max = dp[i];
            }
            
        }
        return max;
    }
}
// @lc code=end
