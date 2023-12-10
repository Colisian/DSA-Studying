package Java;
/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.

 
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums); //Sort array
        int n = nums.length; //set n to be the length of nums to calculate the threshold value 
        return nums[n/2]; //if the array is sorted in order the value that is at the halfway mark should be the majority element.
    }
}
/*
 * HashMap Solution
 */
class Solution1{
    public int majorityElement(int[] nums){
        int n = nums.length; //set nums length to a variable that can be initialized as an integer so that the threshold can be calculated 
        HashMap<Integer, Integer> m = new HashMap<>(); // create the hashmap, keys are the integers in the array and the values are the frequency that they appear

        for (int i = 0; i < nums.length; i++) { //loop through the hashmap
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1); //for each value in the array put the value at the i instance as the key, 
                                                                        //getOrDefault to either retrieve the current count or a default value of 0 if the key is not present and then increments the count by 1.
        }
        n = n/2; //threshold value, majority element shows up n/2 times
        for (Map.Entry<Integer,Integer> entry : m.entrySet()) { //iterates through hashmap series
            if(entry.getValue() > n){ //if the frequency of that element is greater than the threshold value
                return entry.getKey(); //return that value
            }
            
        }
return 0; //if not return 0
    }
}

/*
 * Moore Voting Algorithm
 */
class Solution2{
    public int majorityElement(int[] nums){
        int count = 0; //counter to track how many occurrences an element has
        int element = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) { //if the count is equal to zero
                element = nums[i]; //set element as the value at that index in nums
            }
            if (nums[i] == element) { //if the counter is equal to the element 
                count++; //increase the counter by one
                
            }else count --; //if the next value in the array is not equall to the element decrement count back.
        }
        return element;
    }
    
}

/*
 * Initialize two variables: count and candidate. Set count to 0 and candidate to an arbitrary value.
Iterate through the array nums:
a. If count is 0, assign the current element as the new candidate and increment count by 1.
b. If the current element is the same as the candidate, increment count by 1.
c. If the current element is different from the candidate, decrement count by 1.
After the iteration, the candidate variable will hold the majority element.
 */