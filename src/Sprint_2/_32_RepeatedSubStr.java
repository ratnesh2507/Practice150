package Sprint_2;
/*Checking for a Repeated Substring in a String
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to check if a substring is repeated within a given string.
Example:
Input: string = "abab"
Output: True
Explanation: The substring "ab" is repeated.
 */

//Link https://leetcode.com/problems/repeated-substring-pattern/
//YT https://www.youtube.com/watch?v=bClIZj66dVE

import java.util.Scanner;

public class _32_RepeatedSubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();
        System.out.println(repeatedSubstringPattern(str));
    }
    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=n/2;i>=1;i--){
            if(n % i == 0){
                int repeatCnt = n / i;
                StringBuilder sb = new StringBuilder();
                String substring = s.substring(0,i);
                for(int j=0; j<repeatCnt;j++){
                    sb.append(substring);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}