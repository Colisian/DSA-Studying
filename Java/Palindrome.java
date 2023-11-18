package Java;

public class Palindrome {

    public boolean isPalindrome(int x) {
        if(x < 0){ //Negative numbers are never palindrome
            return false;
        }
        int reverse = 0; //storing the value we will reflect the inputted number 
        int holder = x; //Holder will be the value of the number entering the loop with the last digit removed from the previous loop 

        while(holder != 0){ //Only single integer will be the evaulated not an array so while loop will suffice
            int lastDigit = holder % 10; // this will isolate the last digit of of the number entered (remainder). So if input is 212 first loop lastDigit will be the second 2. Second loop will be 1. Third will be 2
            reverse = reverse * 10 + lastDigit; //This equation will update the reverse integer digit by digit after each loop. If input is 212, first loop will be (reverse = 0 * 10 + 2). Second loop will be (reverse = 2 * 10 + 1), Third will be (reverse = 21 * 10 + 2)
            holder /= 10; // updates holder to be the integer with its last digit removed. If input x = 212 then holder will be 21 which will go into the next while loop
        }
        return(reverse == x);
    }

}
