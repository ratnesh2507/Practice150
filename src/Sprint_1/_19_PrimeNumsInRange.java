package Sprint_1;/*Finding Prime Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all prime numbers within a given range.
Example:
Input: range = [10, 30]
Output: [11, 13, 17, 19, 23, 29]
Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.
 */

//Link https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/

import java.util.Scanner;

public class _19_PrimeNumsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        primesInRange(start, end);
    }

    public static void primesInRange(int start, int end) {
        for(int i = start; i<= end; i++){
            if(_2_Prime.isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
