package Sprint_1;/*Finding the Sum of Prime Numbers in a Range
Difficulty: Medium
Topics: Number Theory, Mathematical Computations
Description: Write a program to calculate the sum of all prime numbers within a given range.
        Example:
Input: range = [1, 10]
Output: 17
Explanation: The sum of prime numbers between 1 and 10 is 2 + 3 + 5 + 7 = 17.
 */

import java.util.Scanner;

public class _35_SumOfPrimeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = sumOfPrimes(start, end);
        System.out.println(sum);
    }

    public static int sumOfPrimes(int start, int end) {
        int sum =0;
        for(int i = start; i<= end; i++){
            if(_2_Prime.isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
}
