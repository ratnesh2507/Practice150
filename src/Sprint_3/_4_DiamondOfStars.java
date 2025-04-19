package Sprint_3;
/*Problem 4: Print a Diamond Pattern
        Difficulty: Easy
        Topics: Pattern Printing
        Hint: Print a diamond pattern with stars (*). The pattern should include a single peak in the middle with symmetric rows above and below it.
        Example 1: Input: n = 3
        Output:
            *
           ***
          *****
           ***
            *
 */

import Sprint_1._7_StarPatterns;
import java.util.*;
public class _4_DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        _7_StarPatterns.Diamond(n);
    }
}
