package Sprint_2;
/*Calculating the Sum of the First N Fibonacci Numbers
Difficulty: Medium
Topics: Fibonacci Sequence, Mathematical Computations
Description: Write a program to calculate the sum of the first N Fibonacci numbers.
Example:
Input: N = 5
Output: 12
Explanation: The first 5 Fibonacci numbers are 1, 1, 2, 3, 5, and their sum is 12.
 */
import java.util.Scanner;

public class _31_SumOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FibonacciSum(n));
    }
    public static int FibonacciSum(int range){
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        sum += num1+num2;
        int num3 = num1 +num2;
        while (num3 <= range){
            sum += num3;
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
        return sum;
    }
}
