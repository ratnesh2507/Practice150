package Sprint_1;/*Finding the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to compute the factorial of a given number.
        Example:
Input: number = 5
Output: 120
Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.
*/

//Link https://www.geeksforgeeks.org/c-program-for-factorial-of-a-number/

import java.util.Scanner;

public class _8_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = Factorial(num);
        System.out.println(res);
    }
    public static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n*(Factorial(n-1));  //Recursion
    }
}
