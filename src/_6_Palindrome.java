/*Identifying Palindromes
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to check if a string or number is a palindrome.
        Example:
Input: string = "radar"
Output: Palindrome
Explanation: "radar" reads the same backward as forward.
*/

//Link https://www.geeksforgeeks.org/palindrome-string/?ref=header_ind

import java.util.Scanner;

public class _6_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        //Two Pointer method
        int flag=0;
        if(n%2==0){
            int p1=n/2 - 1 , p2 = n/2;   // If len(s) is even , take 1st pointer at n/2 -1 and second at n/2
            if(Palindrome(str,p1,p2,n)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }else{
            int p1=n/2, p2 = p1;
            if(Palindrome(str,p1,p2,n)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }

        }
    }
    public static boolean Palindrome(String str,int p1,int p2,int n){
        while(p1>=0 && p2<=n-1){
            if(str.charAt(p1) == str.charAt(p2)){
                p1--;
                p2++;
            }else{
                return false;
            }
        }
        return true;
    }
}
