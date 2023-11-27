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
 * This solution uses a HashMap
 * Common operations include: 
 * Insertion: hashMap.put(key, value); (O(1))
 * Retrieval: value = hashMap.get(key); (O(1))
 * Removal: hashMap.remove(key); (O(1))
 * Checking Existence: boolean exists = hashMap.containsKey(key);
 * Size: int size = hashMap.size();
 * Iterate keys: for (KeyType key : hashMap.keySet()) {Iterate over keys}
 * Iterate values: for (ValueType value : hashMap.values()) {}
 * Check if empty: boolean isEmpty = hashMap.isEmpty();
 * Replace Value: hashMap.replace(key, newValue);
 * Merge with another map: hashMap.putAll(anotherMap);
 * 
 */

 class Solution2{
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>(); //Create HashMap to store elements in array as keys and occurrences as values

            for (int i = 0; i < nums.length; i++) { //Iterate through nums array
                if (map.containsKey(nums[i])) { //If the value is found in the HashMap loop will be true
                    
                    return true;
                    
                }
                map.put(nums[i], 1); //Otherwise store each unique value in the hashmap with the as a key which and a value of 1
            }
            return false;
        }
         
 }
 /* for an example array like [3,2,3,1]
  First iteration 
  {3=1}

  Second iteration
  {3=1, 2=1}

  Third iteration, no change because 3 is not a unique key anymore
  {3=1, 2=1}

  Fourth iteration
  {3=1, 2=1, 1=1}
  */




 /*
  * This method uses a HashSet, which stores a collection of unique elements, constant time performance. 
  * uses basic operations such as add, remove, and contains
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
