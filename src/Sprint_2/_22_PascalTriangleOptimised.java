package Sprint_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Generating Pascal’s Triangle Up to N Rows
Difficulty: Medium
Topics: Combinatorics
Description: Write a program to generate Pascal’s Triangle up to N rows.
Example:
Input: N = 3
Output:
        1
        1 1
        1 2 1
*/

//Link https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

public class _22_PascalTriangleOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascalTriangle(n);
    }
    public static void pascalTriangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(generateRow(i));
        }
        for(List<Integer> row : ans){
            for (Integer num : row) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col=1;col<row;col++){
            ans = ans * (row-col);
            ans = ans / (col);
            ansRow.add(ans);
        }
        return ansRow;
    }
}
