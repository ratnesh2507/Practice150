package Sprint_3;
/*Problem 20: Print a Cross Pattern with Stars
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a cross pattern using stars. The cross should be centered within a matrix.

Example 1: Input: n = 5
Output:

        ***
         *
         *
         *
        ***
 */
import java.util.*;
public class _20_CrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2;
        for(int i=0;i<n;i++){
            if(i == 0 || i == n - 1){
                //top and bottom row
                for (int j = 0; j < n; j++) {
                    if (j >= mid - 1 && j <= mid + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }else{
                //vertical center star
                for (int j = 0; j < n; j++) {
                    if (j == mid) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}