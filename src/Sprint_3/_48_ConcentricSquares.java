package Sprint_3;
/*Problem 48: Print a Pattern with Concentric Squares
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with concentric squares using stars. The outer square should be larger and each subsequent square should be centered inside.
 */

import java.util.Scanner;

public class _48_ConcentricSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Must be odd for proper concentric effect
        printConcentricSquares(n);
    }

    public static void printConcentricSquares(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int layer = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                if (layer % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
