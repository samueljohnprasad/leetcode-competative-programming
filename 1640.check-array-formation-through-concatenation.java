import java.util.HashMap;

/*
 * @lc app=leetcode id=1640 lang=java
 *
 * [1640] Check Array Formation Through Concatenation
 *
 * https://leetcode.com/problems/check-array-formation-through-concatenation/description/
 *
 * algorithms
 * Easy (88.16%)
 * Likes:    112
 * Dislikes: 30
 * Total Accepted:    12.5K
 * Total Submissions: 15.3K
 * Testcase Example:  '[85]\n[[85]]'
 *
 * You are given an array of distinct integers arr and an array of integer
 * arrays pieces, where the integers in pieces are distinct. Your goal is to
 * form arr by concatenating the arrays in pieces in any order. However, you
 * are not allowed to reorder the integers in each array pieces[i].
 * 
 * Return true if it is possible to form the array arr from pieces. Otherwise,
 * return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [85], pieces = [[85]]
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [15,88], pieces = [[88],[15]]
 * Output: true
 * Explanation: Concatenate [15] then [88]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: arr = [49,18,16], pieces = [[16,18,49]]
 * Output: false
 * Explanation: Even though the numbers match, we cannot reorder pieces[0].
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
 * Output: true
 * Explanation: Concatenate [91] then [4,64] then [78]
 * 
 * Example 5:
 * 
 * 
 * Input: arr = [1,3,5,7], pieces = [[2,4,6,8]]
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= pieces.length <= arr.length <= 100
 * sum(pieces[i].length) == arr.length
 * 1 <= pieces[i].length <= arr.length
 * 1 <= arr[i], pieces[i][j] <= 100
 * The integers in arr are distinct.
 * The integers in pieces are distinct (i.e., If we flatten pieces in a 1D
 * array, all the integers in this array are distinct).
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {

        HashMap<Integer,int[]> map=new HashMap();
        for(int []p:pieces){
            map.put(p[0],p);
        }

        int index=0;

        while(index<arr.length){
            if(!map.containsKey(arr[index])) return false;

            int[]  p=map.get(arr[index]);
            for(int i=0;i<p.length;i++){
               if(arr[index++] != p[i]) return false;
            }


        }
        return true;




        

        // for(int [] p:pieces)
        // if(!contains(arr,p)) return false;

        // return true;
    }

    // boolean contains(int [] arr,int [] p ){

    //     int i=0;
    //     int j=0;
    //     while(i<arr.length && arr[i]!=p[j])i++;
    //     while(i<arr.length && j<p.length && arr[i]==p[j]){
    //     i++;
    //     j++;
    //     }
    //     return j==p.length;
    // }
}
// @lc code=end

