/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {

    public static void main(String aa[]){

        isPalindrome(122321);


    }


    public static boolean isPalindrome(int x) {

        //12321 
        if(x<0 || x%10==0 && x!=0)
        return false;

        int rev=0;
        while(x>rev){
            rev=(rev*10)+x%10;  //add and stores mod in rev  
            x/=10;           //12321/10= 1232

        }

        return x==rev || x==rev/10;     //rev/10 incase of odd digit
        
    }

}

// @lc code=end

