package Sprint_2;

/*Finding the Largest Prime Factor of a Number
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find the largest prime factor of a given number.
        Example:
Input: number = 28
Output: 7
Explanation: The prime factors of 28 are 2 and 7, with the largest being 7.
*/

//Link https://www.geeksforgeeks.org/find-largest-prime-factor-number/

import java.util.Scanner;

public class _11_LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(LargestPrimeFactor(num));
    }
    public static int LargestPrimeFactor(int n){
        //let largestPrimeFactor is fact
        int fact = -1;
        //Eliminating factors of 2
        while(n % 2 == 0){
            fact = 2;
            n /= 2;
        }
        //Eliminating factors of 3
        while(n % 3 == 0){
            fact = 3;
            n /= 3;
        }

        for(int i=5;i*i<=n;i+=6){
            while(n%i==0){
                fact = i;
                n /= i;
            }
            while(n%(i+2)==0){
                fact = i+2;
                n /= (i+2);
            }
        }
        if(n>4){
            return n;
        }
        return fact;
    }
}
