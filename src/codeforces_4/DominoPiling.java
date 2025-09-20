package codeforces_4;

import java.util.Scanner;

public class DominoPiling {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = readInt();
        int n = readInt();
        int result = maxDominoes(m, n);
        printResult(result);
    }

    private static int readInt() {
        return sc.nextInt();
    }

    private static int maxDominoes(int m, int n) {
        return (m * n) / 2;
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}