/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {

        int j=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=j+nums[i];
            j=nums[i];
        }
        
        // for(int i=1;i<nums.length;i++){
        //     nums[i]=nums[i-1]+nums[i];
            
        //     }
        
        return nums;
    }
}
// @lc code=end

