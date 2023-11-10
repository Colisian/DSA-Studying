package Java;

/*
 * Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */

class Solution1 { //Kadane's Algorithm
    public int maxSubArray(int[] nums){
        int maxCount = nums[0] ; //sets the initial maximum subarray to the value of the first element. 
        int currentCount = nums[0] ; // Allows starting point for algorithm to begin it's calculations 
        for (int i = 1; i < nums.length ; i++){ //because nums is initiated to start at the first index of nums loop should start at the next value.
            currentCount = Math.max(nums[i],currentCount + nums[i] ); // choose maximum between the integer at that index in nums array and current sum + integer a that element.
            maxCount = Math.max(currentCount,maxCount ); //maxCount will either stay the same or update to be the currentCount calculated in the above equation if it is greater than the maxSum

            // At each step the system will choose the maximum between the currentElement (i) and the sum of the integer at that element and the maxSum 
        }

        return maxCount; // returns total sum

    }
}
/*
 * In Kadane's Algorithm, you start the for loop with i = 1 (second index in array) because the initial values of maxSum and currentSum are set to the value of the first element, nums[0]. 
 * This means that you have effectively included the first element in the currentSum already, so you want to start evaluating the array from the second element onward.
 
 Time complexity of O(N)

Initialization: You've already set maxSum and currentSum to the value of the first element nums[0], making it the initial maximum subarray sum and the current sum.
Iterating Over Subarrays: The purpose of Kadane's Algorithm is to find the maximum subarray sum by considering subarrays that end at each position. By starting the loop with i = 1, 
you begin considering subarrays starting at the second element. This ensures that you're not repeating the same calculations for the first element in each subarray.
Efficiency: By starting with i = 1, you optimize the algorithm's efficiency. 
The maximum subarray sum for the entire array is calculated by iteratively considering each element and deciding whether to extend the current subarray or start a new one. 
Starting from i = 1 avoids unnecessary computations for the first element, which is already included in the initial currentSum.
 */
