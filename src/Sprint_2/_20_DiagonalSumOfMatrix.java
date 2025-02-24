package Sprint_2;
/*Finding the Sum of Diagonal Elements in a Matrix
Difficulty: Easy
Topics: Matrix Operations
Description: Write a program to calculate the sum of the diagonal elements in a square matrix.
        Example:
Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: 15
Explanation: The sum of the diagonal elements (1 + 5 + 9) is 15.
 */

//Link https://www.geeksforgeeks.org/efficiently-compute-sums-of-diagonals-of-a-matrix/

import java.util.Scanner;

public class _20_DiagonalSumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(mat,n));
    }
    public static int diagonalSum(int[][] mat,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) sum += mat[i][j];
            }
        }
        return sum;
    }
}
