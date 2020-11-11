/*
 * @lc app=leetcode id=1464 lang=java
 *
 * [1464] Maximum Product of Two Elements in an Array
 *
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
 *
 * algorithms
 * Easy (77.12%)
 * Likes:    267
 * Dislikes: 65
 * Total Accepted:    56.3K
 * Total Submissions: 73K
 * Testcase Example:  '[3,4,5,2]'
 *
 * Given the array of integers nums, you will choose two different indices i
 * and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [3,4,5,2]
 * Output: 12 
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you
 * will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) =
 * 3*4 = 12. 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,5,4,5]
 * Output: 16
 * Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get
 * the maximum value of (5-1)*(5-1) = 16.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [3,7]
 * Output: 12
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= nums.length <= 500
 * 1 <= nums[i] <= 10^3
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {

//approch1 bruteforce
        int n=nums.length;
        int product=0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
             product=Math.max(product,(nums[i]-1)*(nums[j]-1));
                
                
            }
        }
        return product;
        
    //  //approch2
    //     int l=Integer.MIN_VALUE;
    //     int r=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         if(l<nums[i]){
    //             r=l;
    //             l=nums[i];
    //         }else if(r<nums[i]){
    //             r=nums[i];

    //         }
    //     }
    //     return (r-1)*(l-1);


    //approch3
        // int max=0, i=0,j=1;
        // int n=nums.length;
        // while(i<n && j<n){
        //    max= findMax(nums,max,i,j);
        //     if(nums[j]>nums[i])i=j;
        //     j++;
        // }
        // return max;
        
    }

    // public int findMax(int[] nums,int max,int i,int j){
    //     int product=(nums[i]-1)*(nums[j]-1);
    //     if(product>max)max=product;
    //     return max;
    //  }
}
// @lc code=end

