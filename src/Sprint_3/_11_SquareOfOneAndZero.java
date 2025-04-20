package Sprint_3;
/*Problem 11: Print a Pattern of Alternating 0s and 1s
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a matrix where elements alternate between 0 and 1. The pattern should alternate both row-wise and column-wise.

        Example 1: Input: n = 4
Output:

        0101
        1010
        0101
        1010
 */
import java.util.*;

public class _11_SquareOfOneAndZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        for(int i=0;i<n;i++){
            val = val==0 ? 1 : 0;
            for(int j=0;j<n;j++){
                System.out.print(val);
                val = val==0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}
