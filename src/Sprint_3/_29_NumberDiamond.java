package Sprint_3;
/*Problem 29: Print a Matrix with Diamond Pattern of Numbers
        Difficulty: Hard
        Topics: Matrix Pattern
        Hint: Print a matrix where elements follow a diamond pattern with numbers.

        Example 1: Input: n = 3
        Output:

         1
        121
       12321
        121
         1
 */

import java.util.Scanner;
import static Sprint_3._8_NumberDiamond.printNumberDiamond;
public class _29_NumberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberDiamond(n);
    }
}
