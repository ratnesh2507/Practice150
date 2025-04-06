package Sprint_2;
import java.util.*;
/*Finding the Frequency of Each Character in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to count the frequency of each character in a given string.
Example:
Input: string = "hello"
Output: {'h': 1, 'e': 1, 'l': 2, 'o': 1}
Explanation: The frequency of each character in the string "hello" is shown.
 */

public class _44_FrequencyOfCharsInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();
        frequencyOfCharsInStr(str);
    }
    public static void frequencyOfCharsInStr(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.print("{ " + entry.getKey() + " , freq: " + entry.getValue() + "}");
            System.out.println();
        }
    }
}
