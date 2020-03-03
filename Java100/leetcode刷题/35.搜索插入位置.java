import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        // // 这里的大于等于是非常完美的
        // if (nums[i] >= target) {
        // return i;
        // }
        // }
        // // 这里不行，也是所有的数字都小于这个target数，就直接返回的是数组长度。也就是将target插在最后一位
        // return nums.length;
        // 用arrays的二分搜索来做 速度和上面差不多，都是消耗内存
        // 查看源码，里面使用二分法实现的
        int result = Arrays.binarySearch(nums, target);
        return result >= 0 ? result : -result - 1;
    }
}
// @lc code=end
