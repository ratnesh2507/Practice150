package Sprint_1;/*Checking for an Anagram
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to check if two strings are anagrams.
Example:
Input: string1 = "listen", string2 = "silent"
Output: True
Explanation: "listen" and "silent" are anagrams of each other.
 */

import java.util.HashMap;
import java.util.Scanner;

public class _34_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        //Approach 1 Converting to array then sort, check for equaltiy
       /* char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
        */
        //Approach 2 HashMap
        if(AreAnagrams(str1,str2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
    public static boolean AreAnagrams(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
