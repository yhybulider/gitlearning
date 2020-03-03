/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // Your runtime beats 99.98 % of java submissions
        // Your memory usage beats 5.02 % of java submissions (48.8 MB)
        // 特殊情况
        // if (nums == null || nums.length == 1) {
        // return nums.length;

        // }
        // int n = 0;
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[n] != nums[i]) {
        // n++;
        // nums[n] = nums[i];

        // }

        // }
        // return n + 1;
        //
        // 方式二
        // Your runtime beats 99.98 % of java submissionsl
        // Your memory usage beats 89.32 % of java submissions (39.4 MB)
        if (nums.length < 2) {
            return nums.length;

        }
        int n = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[n] != nums[i]) {
                nums[++n] = nums[i];
            }
        }
        return n + 1;

    }
}
// @lc code=end
