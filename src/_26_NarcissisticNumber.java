/*Checking if a Number is a Narcissistic Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).
Example:
Input: number = 153
Output: Narcissistic Number
Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153.
 */

// SAME AS ARMSTRONG NUMBER

import java.util.Scanner;

public class _26_NarcissisticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrongNum(num)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }
    }
    public static boolean isArmstrongNum(int num){
        int temp = num;
        double rem =0, arm = 0;
        int n = order(num);
        while(temp>0){
            rem = temp%10;
            arm = arm + Math.pow(rem,n);
            temp = temp/10;
        }
        return arm == num;
    }
    public static int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
}
