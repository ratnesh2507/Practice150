/*Checking for Perfect Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is a perfect number.
Example:
Input: number = 28
Output: Perfect Number
Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
 */

//Link https://www.geeksforgeeks.org/perfect-number/

import java.util.Scanner;

public class _20_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPerfect(num)){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
    public static boolean isPerfect(int num){
        int sum = 1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                if(i*i<=num){
                    sum += i + num/i;
                }else{
                    sum += i;
                }
            }
        }
        return sum == num && num != 1;
    }
}
