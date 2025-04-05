package Sprint_1;/*Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Sprint_1._2_Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.
*/

//Link https://www.geeksforgeeks.org/tcs-coding-practice-question-checking-prime-number/?ref=ml_lbp


import java.util.Scanner;

public class _2_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");
        }
    }
//    public static boolean isPrime(int num){
//        int fact = 1;
//        for (int i = 2; i <= num; i++) {
//            if (num % i == 0) {
//                fact++;
//            }
//        }
////        if (fact == 2) {
////            return true;
////        } else {
////            return false;
////        }
//        return fact==2;
//    }
    public static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// Leetcode https://leetcode.com/problems/count-primes/description/
/* Solution
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean []isprime=new boolean[n];
        for(int i=0;i<n;i++){
            isprime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isprime[i]){
                for(int j=i*i;j<n;j+=i){
                    isprime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isprime[i]){
                count++;
            }
        }
        return count;
    }
}
* */