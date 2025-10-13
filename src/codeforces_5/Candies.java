package codeforces_5;

import java.util.Scanner;

public class Candies {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = readCandiesCount();
            System.out.println(calculateAdditionalCandies(n));
        }
    }

    public static int readCandiesCount() {
        return scan.nextInt();
    }

    public static int calculateAdditionalCandies(int n) {
        if (n % 3 == 0) {
            return 0;
        }
        return (n / 3 + 1) * 3 - n;
    }
}