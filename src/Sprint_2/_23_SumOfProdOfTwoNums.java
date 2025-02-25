package Sprint_2;
/*Finding the Sum of Digits of the Product of Two Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to find the sum of the digits of the product of two given numbers.
        Example:
Input: number1 = 12, number2 = 34
Output: 12
Explanation: The product of 12 and 34 is 408, and the sum of its digits is 4 + 0 + 8 = 12.
 */

//Link https://www.geeksforgeeks.org/sum-of-the-products-of-same-placed-digits-of-two-numbers/

import Sprint_1._9_SumOfDigits;

import java.util.Scanner;

public class _23_SumOfProdOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(POS(a,b));
    }
    public static int POS(int a,int b){
        int prod = a*b;
        return _9_SumOfDigits.SumOfDigits(prod);
    }
}
