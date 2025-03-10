package Sprint_1;/*Printing Prime Numbers Less Than a Given Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to print all prime numbers less than a given number.
        Example:
Input: number = 20
Output: 2, 3, 5, 7, 11, 13, 17, 19
Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.
 */

//Link

import java.util.Scanner;

public class _24_PrimeLessThanNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i=2;i<=range;i++){
            if(_2_Prime.isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
