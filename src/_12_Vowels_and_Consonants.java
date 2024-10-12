/*Counting Vowels and Consonants in a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count vowels and consonants in a given string.
Example:
Input: string = "hello world"
Output: Vowels: 3, Consonants: 7
Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).
*/

//Link https://www.geeksforgeeks.org/c-program-to-count-number-of-vowels-and-consonants-in-a-string/

import java.util.Scanner;

public class _12_Vowels_and_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        CountingVowelsAndConsonants(str);
    }
    public static void CountingVowelsAndConsonants(String str){
        int vowels=0, consonants=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
            ||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                vowels++;
            }else {
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowels+" , Consonants: "+consonants);
    }
}

//Leetcode https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/description/