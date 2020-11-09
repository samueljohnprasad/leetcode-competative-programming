/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {  //if we are dividing into half by making mid point
                                                       //then v r looping based on target is greaer or less than mid.

        int low=0;
        int mid;
        int high=nums.length-1;
        while(low<=high){
            mid=low+(high-low)/2;    
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            low=mid+1;
            else 
             high=mid-1;    
        }

        return low;
        
    }
}
// @lc code=end

