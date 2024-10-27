package Sprint_1;/*Generating a Pattern of Numbers
Difficulty: Easy
Topics: Basic Programming, Patterns
Description: Write a program to generate number patterns (e.g., sequential numbers in a matrix).
Example:
Input: rows = 3
Output:
1
2 3
4 5 6
Explanation: A number pattern with 3 rows is generated.
 */

//Link

import java.util.Scanner;

public class _27_NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int num = 1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}