package Sprint_1;/*Calculating Armstrong Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
*/

//Link https://www.geeksforgeeks.org/program-for-armstrong-numbers/

/*
* Approach
* Armstrong is a number that equals the sum of its digits, each raised to a power of no of digits in the number.
* Ex: 153 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
* Ex: 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
 */

import java.util.Scanner;

public class _4_ArmstrongNumber {
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
