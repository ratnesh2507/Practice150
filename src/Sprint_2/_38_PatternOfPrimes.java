package Sprint_2;
import Sprint_1._19_PrimeNumsInRange;
import Sprint_1._2_Prime;

import java.util.*;
/*Generating a Pattern of Prime Numbers
Difficulty: Medium
Topics: Prime Numbers, Patterns
Description: Write a program to generate a pattern where each row contains the first few prime numbers.
Example:
Input: rows = 3
Output:

        2
        2 3
        2 3 5
 */
public class _38_PatternOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        PrimePattern(rows);
    }
    public static void PrimePattern(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int num = 2;
            while (count < i) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }
    public static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
