package Sprint_3;
/*Problem 16: Print a Checkerboard Pattern
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a checkerboard pattern with two different characters alternating.

        Example 1: Input: n = 4
Output:

        XOXOXO
        OXOXOX
        XOXOXO
        OXOXOX
 */
import java.util.*;

public class _16_CheckerboardPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] checkerboard = genCheckerboard(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(checkerboard[i][j]);
            }
            System.out.println();
        }
    }
    public static char[][] genCheckerboard(int n){
        char[][] res = new char[n][n];
        char block = 'O';
        for(int i=0;i<n;i++){
            block = block=='O' ? 'X' : 'O';
            for(int j=0;j<n;j++){
                res[i][j] = block;
                block = block=='O' ? 'X' : 'O';
            }
        }
        return res;
    }
}
