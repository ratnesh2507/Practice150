package Sprint_3;
/*Problem 17: Print a Pyramid Pattern of Increasing Stars
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pyramid pattern where each row increases in the number of stars.

        Example 1: Input: n = 3
Output:

        *
        ***
        *****
 */
import Sprint_1._7_StarPatterns;
import java.util.*;

public class _17_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        _7_StarPatterns.Pyramid(n);
    }
}
