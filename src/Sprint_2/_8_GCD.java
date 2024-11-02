package Sprint_2;
/*Finding the GCD of Multiple Numbers
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to find the GCD (Greatest Common Divisor) of an array of numbers.
Example:
Input: array = [12, 24, 36]
Output: 12
Explanation: The GCD of 12, 24, and 36 is 12.
 */

//Link https://www.geeksforgeeks.org/gcd-two-array-numbers/

public class _8_GCD {
    public static void main(String[] args)
    {
        int[] arr = { 2, 4, 6, 8, 16 };
        int n = arr.length;
        System.out.println(findGCD(arr, n));
    }
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static int findGCD(int[] arr, int n) {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
            if(result == 1) {
                return 1;
            }
        }
        return result;
    }

}