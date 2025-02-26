package Sprint_2;

import java.util.Scanner;

public class _25_MatrixWith0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        printMatrix(size);
    }
    public static void printMatrix(int n){
        int val = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(val+" ");
                val = (val == 0) ? 1 : 0;
            }
            System.out.println();
        }
    }
}
