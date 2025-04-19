package Sprint_1;/*Generating a Number Pyramid
Difficulty: Medium
Topics: Patterns, Basic Programming
Description: Write a program to generate a pyramid of numbers (e.g., 1, 12, 123, etc.).
Example:
Input: rows = 4
Output:

        1
        12
        123
        1234
Explanation: A number pyramid with 4 rows is generated.
 */

//Link

import java.util.Scanner;

public class _47_NumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
