/*Finding the Greatest Common Divisor (GCD)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the GCD of two numbers.
Example:
Input: a = 48, b = 18
Output: 6
Explanation: The GCD of 48 and 18 is 6.
*/

//Link https://www.geeksforgeeks.org/program-to-find-gcd-or-hcf-of-two-numbers/

import java.util.Scanner;

public class _10_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = GCD(a,b);
        System.out.println(res);
    }
    public static int GCD(int a,int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return GCD(a - b, b);
        return GCD(a, b - a);
    }
}
