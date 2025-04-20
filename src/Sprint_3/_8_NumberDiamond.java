package Sprint_3;
/*Problem 8: Print a Diamond Pattern with Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a diamond pattern with numbers. The pattern should have a peak in the middle with symmetric rows above and below it.
Example 1: Input: n = 3
Output:

        1
        121
        12321
        121
        1
 */
import java.util.*;
public class _8_NumberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberDiamond(n);
    }
    public static void printNumberDiamond(int n) {
        // Upper half including middle row
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
