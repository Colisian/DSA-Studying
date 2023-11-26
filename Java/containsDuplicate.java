package Java;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, and return false if every element is distinct.
 */



 //Brute force method, not ideal for large dataSets
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i <nums.length -1; i++){
            for(int j  = i + 1 ; j <nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
    return false;
    }

}

/**
 * This soultion uses a HashMap
 */

 class Solution2{
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    
                    return true;
                    
                }
                map.put(nums[i], 1);
            }
            return false;
        }
         
 }

 /*
  * This method uses a HashSet
  */

  class Solution3{
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                int num = nums[i]; // must make nums the integer value at num[i] so it can be placed in the HashSet
                if (!set.add(num)){ // HashSets can not contain duplicates so if the system can not add the value at num[i] it means that value is already there
                    return true;
                }                    
                    
            }
            return false;
        } 
 }
