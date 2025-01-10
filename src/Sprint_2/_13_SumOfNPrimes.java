package Sprint_2;

/*Finding the Sum of the First N Prime Numbers
Difficulty: Medium
Topics: Prime Numbers, Mathematical Computations
Description: Write a program to calculate the sum of the first N prime numbers.
        Example:
Input: N = 4
Output: 17
Explanation: The sum of the first 4 prime numbers (2 + 3 + 5 + 7) is 17.
 */

//Link Finding the Sum of the First N Prime Numbers

import Sprint_1._2_Prime;

import java.util.Scanner;

public class _13_SumOfNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOfNPrimes(n);
        System.out.println(ans);
    }

    public static int sumOfNPrimes(int n) {
        int count = 0,i=1,sum=0;
        while(count < n){
            if(_2_Prime.isPrime(i)){
                count++;
                sum+=i;
            }
            i++;
        }
        return sum;
    }
}
