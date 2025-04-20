package Sprint_3;
/*Problem 18: Print a Border Pattern with Numbers
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a border pattern using numbers. The border should be filled with numbers, and the inner part should be empty.

        Example 1: Input: n = 4
Output:

        1234
        1  1
        1  1
        1234
 */
import java.util.*;
public class _18_HollowSquareWithNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i <=n;i++){
            for(int j=1;j <=n;j++){
                // Top or bottom row
                if(i==1 || i==n){
                    System.out.print(j);
                }
                // First or last column
                else if(j==1 || j==n){
                    System.out.print(1);
                }
                // Inner space
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
