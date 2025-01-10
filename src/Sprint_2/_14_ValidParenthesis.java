package Sprint_2;

/*Checking for a Balanced Bracket Sequence
Difficulty: Medium
Topics: String Manipulation, Stack
Description: Write a program to check if a given string with brackets is balanced.
        Example:
Input: string = "{[()]}"
Output: True
Explanation: The brackets are balanced.
 */

//Link https://leetcode.com/problems/valid-parentheses

import java.util.Scanner;
import java.util.Stack;

public class _14_ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
