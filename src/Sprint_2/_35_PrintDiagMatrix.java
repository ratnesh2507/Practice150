package Sprint_2;
import java.util.*;
/*Generating a Matrix with a Diagonal Pattern
Difficulty: Medium
Topics: Matrix Operations
Description: Write a program to create a matrix where elements form diagonal lines of a given pattern.
Example:
Input: size = 4
Output:

        1 0 0 0
        1 1 0 0
        1 1 1 0
        1 1 1 1
 */
public class _35_PrintDiagMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (j <= i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
