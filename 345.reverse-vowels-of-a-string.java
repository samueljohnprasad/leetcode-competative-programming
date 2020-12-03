/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 *
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 *
 * algorithms
 * Easy (44.57%)
 * Likes:    832
 * Dislikes: 1319
 * Total Accepted:    248.5K
 * Total Submissions: 556.1K
 * Testcase Example:  '"hello"'
 *
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Example 1:
 * 
 * 
 * Input: "hello"
 * Output: "holle"
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "leetcode"
 * Output: "leotcede"
 * 
 * 
 * Note:
 * The vowels does not include the letter "y".
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {

        char[] arr=s.toCharArray();

        int left=0;
        int right=s.length()-1;

        while(left<right){
            boolean l=isVowel(arr[left]);
            boolean r=isVowel(arr[right]);

            if(l&&r){

                swap(arr,left,right);
                left++;
                --right;

            }
            if(!l)
              left++;

            if(!r)
            --right;
        }

        return new String(arr);
        
    }
    public static void swap(char[] arr,int left,int  right){
        char temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
    }

    public static boolean isVowel(char letter){
        char c= Character.toLowerCase(letter);
        return c=='a'||c=='i'||c=='o'||c=='u'||c=='e';
    }
}
// @lc code=end

