package Sprint_1;/*Finding the Least Common Multiple (LCM)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the LCM of two numbers.
Example:
Input: a = 12, b = 15
Output: 60
Explanation: The LCM of 12 and 15 is 60.
*/

import java.util.Scanner;

//Link https://www.geeksforgeeks.org/program-to-find-lcm-of-two-numbers/
public class _11_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = LCM(a,b);
        System.out.println(res);
        int app2 = LCM2(a,b);
        System.out.println(app2);
    }
    public static int LCM(int a, int b){
        //Approach 1: Using GCD
        return (a / _10_GCD.GCD(a,b))*b;
    }
    public static int LCM2(int a,int b){
        //Approach 2: Using loop
        int large = Math.max(a,b);
        int small = Math.min(a,b);
        for(int i=large;;i=i+large){
            if(i%small == 0){
                return i;
            }
        }
    }
}
