/*Finding the Largest Palindrome in a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to find the largest palindrome in a given string.
Example:
Input: string = "babad"
Output: "bab" or "aba"
Explanation: Both "bab" and "aba" are valid palindromes in the string.
 */

//Link https://www.geeksforgeeks.org/longest-palindromic-substring/

//Leetcode https://leetcode.com/problems/longest-palindromic-substring/solutions/

import java.util.Scanner;

public class _29_LargestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = LongestPalindromicSubstring(str);
        System.out.println(ans);
    }
    public static String LongestPalindromicSubstring(String s){
        if(s.length()<=1){
            return s;
        }
        String maxStr = s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String oddLen = expandFromCenter(s,i,i);
            String evenLen = expandFromCenter(s,i,i+1);
            if(oddLen.length() > maxStr.length()){
                maxStr = oddLen;
            }
            if(evenLen.length() > maxStr.length()){
                maxStr = evenLen;
            }
        }
        return maxStr;
    }
    private static String expandFromCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
/*Approach :
We observe that a palindrome mirrors around its center. Therefore, a palindrome can be expanded from its center,
and there are only 2n - 1 such centers.You might be asking why there are 2n - 1 but not n centers?
The reason is the center of a palindrome can be in between two letters.
Such palindromes have even number of letters (such as "abba") and its center are between the two 'b's.'
Since expanding a palindrome around its center could take O(n) time, the overall complexity is O(n^2).*/