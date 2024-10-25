/*Finding the Count of Specific Digits in a Number
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count the occurrences of a specific digit in a number.
Example:
Input: number = 122333, digit = 3
Output: 3
Explanation: The digit 3 occurs 3 times in the number 122333.
 */

//Link https://www.geeksforgeeks.org/count-the-number-of-occurrences-of-a-particular-digit-in-a-number/

import java.util.Scanner;

public class _41_CountOccurenceOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        System.out.println(CountOccurence(num,digit));
    }
    public static int CountOccurence(int num, int digit){
        int cnt=0;
        while(num!=0){
            int rem = num%10;
            if(rem==digit) cnt++;
            num = num / 10;
        }
        return cnt;
    }
}
