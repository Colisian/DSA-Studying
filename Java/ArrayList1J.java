package Java;
import java.util.ArrayList;
import java.util.List;



/*
You are given an array of integers, and you need to find the two numbers that add up to a given target value. 
Write a function that takes in an array of integers and a target value, 
and returns the indices of the two numbers that add up to the target value. If no such pair exists, return null.
 */

 //Method 1
public class ArrayList1J {

 public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j<nums.length; j++){
            if (i != j && nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
        }

    }
    return null;
    
 }

 //Method 2

 public static int[] findTwoSum(int[] nums, int target){
    List<Integer> indices = new ArrayList<>();
    for(int i = 0; i < nums.length; i++ ){
        int complement  = target - nums[i];

        if (indices.contains(complement)){
            int index1 = indices.indexOf(complement);
            return new int[]{index1,i};
        }
        indices.add(i);
    }
    return null;

    }

/*
 Method will take in two values, one is an array called nums and another an integer called target
 Target is the sum of the two numbers 
 create an new array list called indices
 for loop iterates through the give nums array and finds the complement for each value in the array
 if that compliment is found in the array its index will be saved to index1

 the return statement returns the index of index1 (the complement) and value from nums[i] 
  
 * 
 */

}