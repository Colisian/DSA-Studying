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
        Arrays.sort(nums);
        int n = nums.length;
        return nums [n/2];
    }
}
/*
 * HashMap Solution
 */
class Solution1{
    public int majorityElement(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        n = n/2;
        for (Map.Entry<Integer,Integer> entry : m.entrySet()) {
            if(entry.getValue() > n){
                return entry.getKey();
            }
            
        }
return 0;
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