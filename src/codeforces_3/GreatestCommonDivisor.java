package codeforces_3;

import java.util.Scanner;

public class GreatestCommonDivisor {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] main) {
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(gcdOfFactorials(a, b));
    }

    public static int gcdOfFactorials(int a, int b) {
        int minValue = Math.min(a, b);
        int fact = 1;

        for (int i = 2; i <= minValue; i++) {
            fact *= i;
        }

        return fact;
    }
}
