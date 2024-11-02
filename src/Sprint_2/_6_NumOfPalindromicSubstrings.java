package Sprint_2;
/*Counting the Number of Palindromic Substrings in a String
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to count how many palindromic substrings exist in a given string.
Example:
Input: string = "aaa"
Output: 6
Explanation: Palindromic substrings are "a", "a", "a", "aa", "aa", "aaa".
 */

// Link https://www.geeksforgeeks.org/count-palindrome-sub-strings-string/

// Leetcode https://leetcode.com/problems/palindromic-substrings/description/

import java.util.Scanner;

public class _6_NumOfPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(CountPalindromes(str));
    }
    public static int CountPalindromes(String s){
        if(s.isEmpty()){
            return 0;
        }
        int count = 0;
        for(int i=0;i<s.length();i++){
            count += ExpandFromCenter(s,i,i);
            count += ExpandFromCenter(s,i,i+1);
        }
        return count;
    }
    private static int ExpandFromCenter(String s,int left,int right){
        int cnt = 0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}
