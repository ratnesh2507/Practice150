package Sprint_3;
/*Problem 41: Print a Pattern with Spiral and Zigzag
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix with both spiral and zigzag patterns. The matrix should first fill in a spiral pattern and then in a zigzag fashion.

        Example 1: Input: n = 3
Output:

        1 2 3
        6 5 4
        7 8 9
 */

import java.util.Scanner;

public class _41_SpiralAndZigZagMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] result = generateZigzagMatrix(n);
        printMatrix(result);
    }
    public static int[][] generateZigzagMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                // Right to left
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
