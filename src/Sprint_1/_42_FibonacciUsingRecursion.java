package Sprint_1;/*Generating a Fibonacci Sequence Using Recursion
Difficulty: Medium
Topics: Recursion, Sequences
Description: Write a recursive program to generate the Fibonacci sequence up to a given number.
Example:
Input: number = 5
Output: 0, 1, 1, 2, 3
Explanation: The Fibonacci sequence up to 5 is generated.
 */

//Link https://www.upgrad.com/tutorials/software-engineering/c-tutorial/fibonacci-series-in-c-using-recursion/

import java.util.Scanner;

public class _42_FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print(RecursiveFibonacci(i)+", ");
        }
    }
    public static int RecursiveFibonacci(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else{
            return RecursiveFibonacci(n-1) + RecursiveFibonacci(n-2);
        }
    }
}
