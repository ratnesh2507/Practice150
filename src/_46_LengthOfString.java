/*Determining the Length of a String Without Using Built-In Functions
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to determine the length of a string without using built-in functions.
Example:
Input: string = "hello"
Output: 5
Explanation: The length of the string "hello" is determined without using built-in functions.
 */

//Link https://www.geeksforgeeks.org/length-of-string-without-using-the-strlen-function-in-c/

import java.util.Scanner;

public class _46_LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = 0;
        for(int i=0;i<str.length();i++){
            len++;
        }
        System.out.println(len);
    }
}
