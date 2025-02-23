package Sprint_2;
/*Finding the Sum of Numbers in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to extract and sum all numbers present in a given string.
Example:
Input: string = "The numbers are 12 and 34"
Output: 46
Explanation: The sum of numbers 12 and 34 is 46.
 */

//Link https://www.geeksforgeeks.org/calculate-sum-of-all-numbers-present-in-a-string/

import java.util.Scanner;

public class _15_SumOfNumsInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String tempStr = "0";
        System.out.println(NumsInStr(str, tempStr));
    }

    private static int NumsInStr(String str, String tempStr) {
        int sum = 0;
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                tempStr += ch;
            }else{
                sum += Integer.parseInt(tempStr);
                tempStr = "0";
            }
        }
        return sum + Integer.parseInt(tempStr);
    }
}
