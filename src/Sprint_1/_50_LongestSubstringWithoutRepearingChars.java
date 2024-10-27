package Sprint_1;/*Finding the Longest Substring Without Repeating Characters
Difficulty: Medium
Topics: String Manipulation, Sliding Window
Description: Write a program to find the longest substring without repeating characters in a given string.
        Example:
Input: string = "abcabcbb"
Output: "abc"
Explanation: The longest substring without repeating characters is "abc".
 */

//Link https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Scanner;

public class _50_LongestSubstringWithoutRepearingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(LongestSubStringWithNoRepeatingChar(str));
    }
    public static String LongestSubStringWithNoRepeatingChar(String s){
        int left = 0;
        int maxLength = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, shrink the window from the left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Update maximum length and starting index if we found a longer substring
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        // Return the longest substring found
        return s.substring(start, start + maxLength);
    }
}
