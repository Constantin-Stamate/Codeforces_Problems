package codeforces_3;

import java.util.Scanner;

public class OneDigit {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            System.out.println(findMinimumDigit(n));
        }
    }

    public static int findMinimumDigit(int n) {
        int minDigit = Integer.MAX_VALUE;

        while (n != 0) {
            minDigit = Math.min(minDigit, n % 10);
            n /= 10;
        }

        return minDigit;
    }
}
