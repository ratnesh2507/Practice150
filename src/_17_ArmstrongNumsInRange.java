/*Checking for Armstrong Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all Armstrong numbers within a given range.
Example:
Input: range = [1, 500]
Output: [1, 153, 370, 371, 407]
Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.
 */

//Link

import java.util.Scanner;

public class _17_ArmstrongNumsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i==1 || (_4_ArmstrongNumber.isArmstrongNum(i) && i>10)){
                System.out.print(i+" ");
            }
        }
    }
}
