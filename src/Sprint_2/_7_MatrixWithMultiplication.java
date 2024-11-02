package Sprint_2;
/*Generating a Matrix with Multiplication Table
Difficulty: Easy
Topics: Arrays, Matrix Operations
Description: Write a program to generate a matrix where each element at position (i, j) is the product of i and j.
Example:
Input: size = 3
Output:
1 2 3
2 4 6
3 6 9
*/

//Link

import java.util.Scanner;

public class _7_MatrixWithMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size+1][size+1];
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                mat[i][j] = i*j;
            }
        }
        //printing
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
