/*Reversing a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to reverse a given string.
Example:
Input: string = "programming"
Output: "gnimmargorp"
Explanation: The reversed string of "programming" is "gnimmargorp".
 */

//Link https://www.geeksforgeeks.org/reverse-a-string-in-java/

import java.util.Scanner;

public class _13_ReversingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = ReverseString(str);
        System.out.println("Reversed string :"+rev);
    }
    public static String ReverseString(String str){
        String reverse = "";
        char ch;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            reverse = ch + reverse;
        }
        return reverse;
    }
}

