package Sprint_1;/*Finding All Divisors of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find all divisors of a given number.
        Example:
Input: number = 12
Output: 1, 2, 3, 4, 6, 12
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, and 12.
 */

//Link https://www.geeksforgeeks.org/find-all-factors-of-a-natural-number/

import java.util.Scanner;

public class _43_DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintDivisors(num);
    }
    public static void PrintDivisors(int n){
       for(int i=1;i<=n/2;i++){
           if(n%i==0){
               System.out.print(i+", ");
           }
       }
        System.out.print(n);
    }
}
