package Sprint_3;
/*Problem 47: Print a Matrix with Cross Pattern of Numbers
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix where the center forms a cross pattern with numbers.

Example 1: Input: n = 5
Output:

        12321
        01210
        01210
        01210
        12321
 */

import java.util.Scanner;

public class _47_CentredCrossMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printCrossPattern(n);
    }
    public static void printCrossPattern(int n) {
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value;
                if (i == 0 || i == n - 1) {
                    value = j <= mid ? j + 1 : n - j;
                } else {
                    value = j <= mid ? j : n - 1 - j;
                }
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
