import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {


    //1.bruteforce approch
    //2.two pass hash table approch
    //3.one pass hash table approch


   // Time complexity : O(n^2)
   //For each element, we try to find its complement by looping through the rest of array which takes O(n)O(n) time. Therefore, the time complexity is O(n^2)
  // Space complexity : O(1).


    public static void main(String aa[]){
        int [] nums={2,3,4,8};

      int[] res= twoSum(nums,7);  //storing the values of return array from twosum method
    // int [] res=twoSumm(nums,10);
        for(int i=0;i<res.length;i++){
        System.out.println(res[i]+" ");
        }

}
    public static int[] twoSum(int[] nums, int target) { 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if(nums[j]==target-nums[i]){
               return new int[] {i,j};
               }

            }
        }
        throw new IllegalArgumentException("error");
        
        
    }


//approch3
//We can reduce the look up time from O(n) to O(1)O(1) by trading space for speed.\
//A hash table is built exactly for this purpose, it supports fast look up in near constant time

public static int[] twoSumm(int[] nums,int target){
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int num1=target-nums[i];        
        if(map.containsKey(num1)){
            return new int[] {map.get(num1),i};
        }

        map.put(nums[i],i);
    }
    throw new IllegalArgumentException("no solution");

}
//Time complexity :O(n). we transerve the list containing n elements only once.each loop into hashmap table costs only O(1) time.
//Space complexity:O(n). the extra space required depends on number of elements stored in the hashtable.

}

