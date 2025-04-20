package Sprint_3;
/*Problem 24: Print a Pattern of Increasing and Decreasing Stars
        Difficulty: Hard
        Topics: Pattern Printing
        Hint: Print a pattern where stars increase to a midpoint and then decrease.

        Example 1: Input: n = 3
        Output:

        *
       ***
      *****
       ***
        *
 */
import java.util.*;
public class _24_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStarDiamond(n);
    }
    public static void printStarDiamond(int n) {
        // Upper part (including middle line)
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
