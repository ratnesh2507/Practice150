package Sprint_3;
/*Problem 12: Print a Pascal’s Triangle
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print Pascal’s Triangle up to N rows. Each row should be constructed based on the sum of the elements directly above it in the previous row.

        Example 1: Input: n = 4
Output:

        1
        1 1
        1 2 1
        1 3 3 1
 */
import Sprint_2._22_PascalTriangleOptimised;

import java.util.*;

public class _12_PascalTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        _22_PascalTriangleOptimised.pascalTriangle(n);
    }
}
