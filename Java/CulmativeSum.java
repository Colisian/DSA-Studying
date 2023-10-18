package Java;

import java.util.List;
import java.util.ArrayList;;

/*

The cumulative sum of an array at index i is defined as the sum of 
all elements of the array from index 0 to index i.

Examples
Initial Array: [1, 2, 3, 4]
Cumulative Sum: [1, 3, 6, 10]

Initial Array: [1, 1, 1, 1, 1]
Cumulative Sum: [1, 2, 3, 4, 5]

Initial Array: [1, 3, 5, 7, 9]
Cumulative Sum: [1, 4, 9, 16, 25] */

class Solution1 {
	int[] getCumulativeSum (int[] arr) {
		int[] cumlativeSum = new int[arr.length]; //Create new array called cumlativeSum that is the same length as arr
		int sum = 0; // intilize sum variable to hold and keep track of the running total
		for (int i = 0; i < arr.length ; i++){ //for each value in the arr array...
			sum += arr[i]; // ...add the value at that position to the total sum from the previous loops
			cumlativeSum[i] = sum; // make the value at that position in the array equal to the sum of that round of loop
		}
		return cumlativeSum;
	}
}


//Below method is less efficient with time complex. of O(n^2) becuase it iterates through all indexes
//each time
class Solution2 {
    int[] getCumulativeSum (int[] arr) {

       int prefixSum[] = new int[arr.length];
       for(int i = 0; i < arr.length; i++) {
           int prefix = 0;
           for(int j = 0; j <= i; j++) {
               prefix += arr[j];
           }
           prefixSum[i] = prefix;
       }
       return prefixSum;
   }

}


//Get positive cumulative sum

class Solution3{
    List<Integer> getPositveCumulativeSum(int[] arr){
        List<Integer> positveCumlativeSum = new ArrayList<>();
        int cumlativeSum = 0;

        for(int i = 0; i < arr.length; i++){
            cumlativeSum += arr[i];
            if (cumlativeSum>0){
                positveCumlativeSum.add(cumlativeSum);
            }
        }
        return positveCumlativeSum;
    }
}