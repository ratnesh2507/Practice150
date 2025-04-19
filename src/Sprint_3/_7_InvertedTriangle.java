package Sprint_3;
/*Problem 7: Print an Inverted Triangle Pattern
        Difficulty: Easy
        Topics: Pattern Printing
        Hint: Print an inverted triangle pattern with stars (*). Each row should contain decreasing numbers of stars from the top row.

        Example 1: Input: n = 5
        Output:

        *****
        ****
        ***
        **
        *
 */
import java.util.*;
public class _7_InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int space=0;space<i;space++){
                System.out.print(" ");
            }
            for(int star=0;star<n-i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
