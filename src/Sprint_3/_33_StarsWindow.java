package Sprint_3;
/*Problem 33: Print a Pattern of Nested Squares
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with nested squares using stars. The outermost square should be filled with stars, and each subsequent square should be smaller and centered inside the previous one.

Example 1: Input: n = 5
Output:

        *****
        *   *
        *   *
        *   *
        *****
 */

import java.util.Scanner;

public class _33_StarsWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        _5_HollowSquareOfStars.HollowSquare(n);
    }
}
