/*
 * @lc app=leetcode id=1389 lang=java
 *
 * [1389] Create Target Array in the Given Order
 *
 * https://leetcode.com/problems/create-target-array-in-the-given-order/description/
 *
 * algorithms
 * Easy (84.47%)
 * Likes:    324
 * Dislikes: 450
 * Total Accepted:    63.6K
 * Total Submissions: 75.2K
 * Testcase Example:  '[0,1,2,3,4]\n[0,1,2,2,1]'
 *
 * Given two arrays of integers nums and index. Your task is to create target
 * array under the following rules:
 * 
 * 
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the
 * value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and
 * index.
 * 
 * 
 * Return the target array.
 * 
 * It is guaranteed that the insertion operations will be valid.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 * Explanation:
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
 * Output: [0,1,2,3,4]
 * Explanation:
 * nums       index     target
 * 1            0        [1]
 * 2            1        [1,2]
 * 3            2        [1,2,3]
 * 4            3        [1,2,3,4]
 * 0            0        [0,1,2,3,4]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1], index = [0]
 * Output: [1]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length, index.length <= 100
 * nums.length == index.length
 * 0 <= nums[i] <= 100
 * 0 <= index[i] <= i
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int arr[]=new int [n];

        for(int i=0;i<n;i++){
            int k=index[i];
            for(int j=Math.min(i+1,n-1);j>k;j--){  //replacing array element in nxt pos beforing iserting
                                                   //in kth pos
             arr[j]=arr[j-1];
            }

            arr[k]=nums[i];


        }

        return arr;
        
    }
}
// @lc code=end

