package Sprint_3;
/*Problem 9: Print a Right-Angle Triangle of Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a right-angle triangle pattern with increasing numbers. Each row should contain a continuous sequence of increasing numbers.

Example 1: Input: n = 4
Output:

        1
        23
        456
        78910
 */
import java.util.*;

public class _9_RightTriangleOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
