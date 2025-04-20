package Sprint_3;
/*Problem 50: Print a Matrix with Zigzag Pattern of Stars
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a matrix where stars form a zigzag pattern, alternating rows in their positioning.

        Example 1: Input: n = 3
Output:

        * * *
         * *
        * * *
 */
import java.util.*;

public class _50_StarZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printZigzagStars(n);
    }
    public static void printZigzagStars(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print(" ");
                for (int j = 0; j < n - 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
