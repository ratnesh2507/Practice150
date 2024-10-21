/*Generating a Square Matrix of a Given Size
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a square matrix of a given size and fill it with sequential numbers.
Example:
Input: size = 3
Output:
        1 2 3
        4 5 6
        7 8 9
Explanation: A 3x3 matrix is generated with sequential numbers.
 */

//Link

import java.util.Scanner;

public class _39_NumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        int num=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
