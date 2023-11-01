package Java;

public class Palindrome {

    public boolean isPalindrome(int x) {
        if(x < 0){ //Negative numbers are never palindrome
            return false;
        }
        int reverse = 0; //storing the value we will continue to edit
        int holder = x; //Holder will be the value of the number entrered with the last digit removed after each loop 

        while(holder != 0){ //Only single integer so while loop will suffice
            int lastDigit = holder % 10; // this will isolate the last digit of of the number entered (remainder) 
            reverse = reverse * 10 + lastDigit; //This equation will reverse the integer digit by digit after each loop
            holder /= 10; // updates holder to be the integer with its last digit removed
        }
        return(reverse == x);
    }

}
