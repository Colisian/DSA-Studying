package Java;

public class removeElement {
    public int removeElement(int[] nums, int val) {
        
        int count = 0; // counter to return each value removed
        for (int i = 0; i < nums.length ; i ++){ // input is array is for loop is sed to iterate through is
            if (nums[i] != val){ // if the value inputted for val is equal to the value at index i in nums
                nums[count++] = nums[i]; //nums[i] refers to the current element in the original nums array.   
                                        // count++ means the value of count is used as the index, and then the counter is incrmeneted by 1
            }

        }
        
    return count;
    }
}
