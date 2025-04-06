package Sprint_2;
import java.util.*;
import static Sprint_1._34_Anagram.AreAnagrams;
/*Checking for Anagram Pairs in a List of Strings
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to find pairs of strings in a list that are anagrams of each other.
        Example:
Input: strings = ["listen", "silent", "hello", "world"]
Output: [("listen", "silent")]
Explanation: "listen" and "silent" are anagrams.
 */

public class _43_AnagramsInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i] = sc.next();
        }
        anagramsInStr(strings);
    }
    public static void anagramsInStr(String[] strings){
        int n = strings.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(AreAnagrams(strings[i], strings[j])){
                    System.out.println("(" + strings[i] + ", " + strings[j] + ")");
                }
            }
        }
    }
}
