package Sprint_3;
/*Problem 32: Print a Star Pattern with Increasing and Decreasing Width
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with stars that increase to a midpoint and then decrease. The stars should be centered horizontally.

Example 1: Input: n = 3
Output:

        *
       ***
      *****
       ***
        *
 */

import java.util.Scanner;
import static Sprint_3._24_Diamond.printStarDiamond;
public class _32_StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStarDiamond(n);
    }
}