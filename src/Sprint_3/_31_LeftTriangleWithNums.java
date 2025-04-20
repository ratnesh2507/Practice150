package Sprint_3;
/*Problem 31: Print a Triangular Matrix with Numbers
        Difficulty: Easy
        Topics: Pattern Printing
        Hint: Print a triangular matrix where each row contains increasing numbers. Each subsequent row should start from the next number.

        Example 1: Input: n = 3
        Output:

        1
        2 3
        4 5 6
 */

import java.util.Scanner;
public class _31_LeftTriangleWithNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
