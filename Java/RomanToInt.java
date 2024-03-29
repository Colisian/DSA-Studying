package Java;
/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 Roman numerals are usually written largest to smallest from left to right. 
 However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
 The same principle applies to the number nine, which is written as IX. 
  
 There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 */

import java.util.HashMap;
import java.util.Map;

//Switch case method
public class RomanToInt {
    private int translate(char c){
        switch(c){
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default :
            return 0; 
        }
    }
    public int romanToInt(String s) {
        int sum = 0; //variable to store the sum over iterations
        int currentChar = translate(s.charAt(0)); //currentCharacter starts at index 0 

        for(int i = 1; i<s.length(); i++){ //i = 1 here because we are comparing the current value  to the next char so we are starting the loop at index 1 and comparing char at 0 and 1. 
            int nextChar = translate(s.charAt(i)); //translate turns character from char to int
            if(currentChar < nextChar)
                sum -= currentChar; //if the next character is less than the previous character such like VI (5 and 1) then the value is 5 minus 1 which is four
            else sum += currentChar; // if the next character is equal or more  VX (5 and 10) value is 15
        currentChar = nextChar;
        }
        sum += currentChar;
        return sum;
    }
}

//Hashmap method
class RomanToIntHash{
    public int romanToInt(String s){
        Map<Character, Integer> m =  new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int answer = 0;

        for(int i = 0; i<s.length();i++ ){
            if(i < s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){ 
                //i must be < s.length because it ensures there is always a character to compare to. 
                // Without -1 an out-of-bounds error when at the last character will occur because there would be no nextCHar to compare to. 
                /*
                 Another option could be 
                 for(int i = 1; i<s.length();i++ ){
                     if( m.get(s.charAt(i-1)) < m.get(s.charAt(i))){
                     answer -= m.get(s.charAt(i-1));
                        } else {
                        answer +=m.get(s.charAt(i-1));
                    }
                }
                answer += m.get(s.charAt(s.length() - 1)); outside of the loop, must add value of last character
                 */
                answer -= m.get(s.charAt(i));
        } else {
            answer +=m.get(s.charAt(i));
            }

        } return answer;

    }

}