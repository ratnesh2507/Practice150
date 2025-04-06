package Sprint_2;
import java.util.*;
/*Generating a Pattern of Increasing Numbers
Difficulty: Easy
Topics: Patterns
Description: Write a program to create a pattern where numbers increase with each row.
        Example:
Input: rows = 3
Output:

        1
        12
        123
 */

public class _41_PatternOfIncreasingNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        increasingNumsPattern(n);
    }
    public static void increasingNumsPattern(int n){
        for(int i=0;i<n;i++){
            int cnt=0;
            int num=1;
            while(cnt <= i){
                System.out.print(num+" ");
                cnt++;
                num++;
            }
            System.out.println();
        }
    }
}
