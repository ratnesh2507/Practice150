package Sprint_3;
/*Problem 23: Print a Diamond Pattern with Numbers Increasing
        Difficulty: Hard
        Topics: Pattern Printing
        Hint: Print a diamond pattern where numbers increase. Each row should show a symmetrical pattern with numbers increasing towards the center.

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
public class _23_NumDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberDiamond(n);
    }
}
