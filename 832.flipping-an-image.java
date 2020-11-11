/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 *
 * https://leetcode.com/problems/flipping-an-image/description/
 *
 * algorithms
 * Easy (76.75%)
 * Likes:    1035
 * Dislikes: 161
 * Total Accepted:    193.6K
 * Total Submissions: 251.6K
 * Testcase Example:  '[[1,1,0],[1,0,1],[0,0,0]]'
 *
 * Given a binary matrix A, we want to flip the image horizontally, then invert
 * it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * 
 * To invert an image means that each 0 is replaced by 1, and each 1 is
 * replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * Example 1:
 * 
 * 
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row:
 * [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * 
 * Notes:
 * 
 * 
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {


    //         for(int i=0;i<A.length;i++){
    //             for(int j=0;j<A[0].length/2;j++){
    //                 int temp=A[i][j];
    //                  A[i][j]=A[i][A[0].length-j-1];
    //                  A[i][A[0].length-j-1]=temp;
                     
    //             }
    //             for(int j=0;j< A[0].length;j++){
    //                 A[i][j]=A[i][j]==1?0:1;

    //         }
    //     }
    // return A;

    for(int i=0;i<A.length;i++){
        int start=0;
        int end=A[0].length-1;
        while(start<=end){
            int temp=A[i][start];
            A[i][start]=A[i][end]==0?1:0;
            A[i][end]=temp==0?1:0;

            start++;
            end--;
        }

    }
    return A;
        
    }
}
// @lc code=end

