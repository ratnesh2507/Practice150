package Sprint_3;
/*Problem 3: Print a Pyramid Pattern
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a pyramid pattern with stars (*). The pyramid should have a single peak and each row should have an increasing number of stars, centered horizontally.

Example 1: Input: n = 3
Output:

        *
        ***
        *****
 */
import Sprint_1._7_StarPatterns;
import java.util.*;

public class _3_PyramidOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        _7_StarPatterns.Pyramid(n);
    }
}
