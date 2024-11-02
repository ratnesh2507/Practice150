package Sprint_2;
/*Finding the Sum of the First N Odd Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to calculate the sum of the first N odd numbers.
        Example:
Input: N = 5
Output: 25
Explanation: Sum of the first 5 odd numbers (1 + 3 + 5 + 7 + 9) is 25.
 */

//Link

import java.util.Scanner;

public class _9_SumOfNoddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*n;
        System.out.println(sum);
    }
}
