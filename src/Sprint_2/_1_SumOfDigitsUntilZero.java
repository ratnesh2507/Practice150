package Sprint_2;

import Sprint_1._40_SumOfDigitsUntilZero;

import java.util.Scanner;

public class _1_SumOfDigitsUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = _40_SumOfDigitsUntilZero.DigSum(num);
        System.out.println(ans);
    }
}
