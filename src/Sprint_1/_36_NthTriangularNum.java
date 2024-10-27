package Sprint_1;/*Finding the N-th Triangular Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the N-th triangular number.
        Example:
Input: N = 4
Output: 10
Explanation: The 4th triangular number is 10 (sum of the first 4 natural numbers).
 */

//Link https://www.geeksforgeeks.org/triangular-numbers/

import java.util.Scanner;

public class _36_NthTriangularNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = N*(N +1)/2;
        System.out.println(N +"th triangular num = "+ans);
    }
}
