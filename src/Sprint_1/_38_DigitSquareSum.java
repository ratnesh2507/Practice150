package Sprint_1;/*Finding the Sum of Squares of Digits
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the squares of the digits of a number.
Example:
Input: number = 123
Output: 14
Explanation: The sum of the squares of digits is 1^2 + 2^2 + 3^2 = 14.
 */

//Link

import java.util.Scanner;

public class _38_DigitSquareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = SumOfSquareOfDigits(num);
        System.out.println(ans);
    }
    public static int SumOfSquareOfDigits(int num){
        int sum = 0, rem = 0;
        while(num!=0){
            rem = num%10;
            sum += rem*rem;
            num /= 10;
        }
        return sum;
    }
}
