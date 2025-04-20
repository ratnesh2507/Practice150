package Sprint_3;
/*Problem 22: Print a Diamond Pattern with Increasing Width
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a diamond pattern where each line has increasing width of stars.

Example 1: Input: n = 3
Output:

         *
        ***
       *****
        ***
         *
 */
import java.util.*;

import static Sprint_3._24_Diamond.printStarDiamond;

public class _22_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStarDiamond(n);
    }
}
