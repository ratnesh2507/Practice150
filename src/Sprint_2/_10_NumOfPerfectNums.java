package Sprint_2;
/*Finding the Number of Perfect Numbers Up to a Given Limit
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find how many perfect numbers exist up to a given limit.
        Example:
Input: limit = 30
Output: 1
Explanation: There is only one perfect number (6) up to 30.
 */

import Sprint_1._20_PerfectNumber;

import java.util.Scanner;

public class _10_NumOfPerfectNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int cnt=0;
        for(int i=2;i<=limit;i++){
            if(_20_PerfectNumber.isPerfect(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
