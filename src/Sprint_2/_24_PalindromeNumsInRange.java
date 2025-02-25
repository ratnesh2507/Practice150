package Sprint_2;
/*Checking for Palindromic Numbers in a Range
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to check for palindromic numbers within a given range.
Example:
Input: start = 1, end = 100
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99]
Explanation: Palindromic numbers between 1 and 100 are the numbers listed.
*/

//Link https://www.geeksforgeeks.org/program-print-palindromes-given-range/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _24_PalindromeNumsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(palindromesInRange(start,end));
    }
    public static List<Integer> palindromesInRange(int start, int end) {
        List<Integer> palindromes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                palindromes.add(i);
            }
        }
        return palindromes;
    }
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}