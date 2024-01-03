package Java;


/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
 * The remaining elements of nums are not important as well as the size of nums.Return k.
 * 
 * 
 * Example
 * Input: nums = [1,1,2] 
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * 
 * 
 */

public class removeDuplicate {

    public int removeDuplicates(int[] nums) {
            //Use i and j indices to iterate through array and 
        int j = 1; //First element in array is always considered unique so we start the check at the first index
        for (int i = 1; i < nums.length; i++) { // increment the array 
            if (nums[i] != nums[i - 1]) { //if the number previous is not current to the number at i then it is unique (first loop is comparing nums[i] to nums[0])
                nums[j] = nums[i]; //update the unique number at i to be the number at j
                j++; //increment j by one to be the next comparison value
            }
            
        }
        return j; //if the number is not unique, or a duplicate, then return j
    }
    
}
