/*Finding the Sum of Prime Factors of a Number
Difficulty: Medium
Topics: Number Theory, Mathematical Computations
Description: Write a program to find the sum of the prime factors of a given number.
        Example:
Input: number = 12
Output: 5
Explanation: The prime factors of 12 are 2 and 3, and their sum is 2 + 3 = 5.
 */

//Link https://www.geeksforgeeks.org/sum-of-all-the-prime-divisors-of-a-number/

import java.util.Scanner;

public class _48_SumOfPrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumOfPrimes = SumOfPrimeFactors(num);
        System.out.println(sumOfPrimes);
    }
    public static int SumOfPrimeFactors(int n){
        int sum =0;
        if(_2_Prime.isPrime(n)) sum+= n;
        for(int i=2;i<=n/2;i++){
            if(n%i==0 && _2_Prime.isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
