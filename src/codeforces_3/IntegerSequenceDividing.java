package codeforces_3;

import java.util.Scanner;

public class IntegerSequenceDividing {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] main) {
        long n = scan.nextLong();
        System.out.println(calcMinDifference(n));
    }

    static int calcMinDifference(long n) {
        long sum = n * (n + 1) / 2;
        return (int) (sum % 2);
    }
}