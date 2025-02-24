package Sprint_2;
/*Checking for Perfect Squares in a Range
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to check which numbers in a given range are perfect squares.
Example:
Input: start = 1, end = 10
Output: [1, 4, 9]
Explanation: Perfect squares between 1 and 10 are 1, 4, and 9.
 */

//Link https://www.geeksforgeeks.org/find-number-perfect-squares-two-given-numbers/

import Sprint_1._37_PerfectSquare;

import java.util.Scanner;

public class _19_PerfectSquaresInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        perfectSquaresInRange(start,end);
    }
    public static void perfectSquaresInRange(int a,int b){
        for(int i=a;i<=b;i++){
            if(_37_PerfectSquare.isPerfectSquare(i)){
                System.out.print(i+" ");
            }
        }
    }
}
