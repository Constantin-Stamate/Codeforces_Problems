package codeforces_4;

import java.util.Scanner;

public class TheatreSquare {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = readLong();
        long m = readLong();
        long a = readLong();

        long result = calculateTiles(n, m, a);
        printResult(result);
    }

    private static long readLong() {
        return sc.nextLong();
    }

    private static long calculateTiles(long n, long m, long a) {
        return ((n + a - 1) / a) * ((m + a - 1) / a);
    }

    private static void printResult(long result) {
        System.out.println(result);
    }
}