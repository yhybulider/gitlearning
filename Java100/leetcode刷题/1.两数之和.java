import java.util.HashMap;
import java.util.Map;

// package music.ShuaTi;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //使用键值对进行比较对照
        //官方题解
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i < nums.length; i++){
        int sum = target - nums[i];
        //使用键进行比较查找，当找到匹配的值时候，
        //就将其相应的值也就是索引打出来
         
        if(map.containsKey(sum)){
            return new int[]{map.get(sum),i};
        }
        map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no match");
    }
}
// @lc code=end

