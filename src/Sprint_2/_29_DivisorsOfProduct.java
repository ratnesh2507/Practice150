package Sprint_2;

import java.util.Scanner;

/*Finding All Divisors of the Product of Two Numbers
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find all divisors of the product of two given numbers.
Example:
Input: number1 = 6, number2 = 10
Output: [1, 2, 3, 5, 6, 10, 15, 30]
Explanation: The product of 6 and 10 is 60, and its divisors are listed.
 */
public class _29_DivisorsOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        DivisorsOfProduct(num1*num2);
    }
    public static void DivisorsOfProduct(int num){
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
