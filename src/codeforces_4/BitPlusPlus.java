package codeforces_4;

import java.util.Scanner;

public class BitPlusPlus {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = readInt();
        int x = processStatements(n);
        printResult(x);
    }

    private static int readInt() {
        return sc.nextInt();
    }

    private static int processStatements(int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    private static void printResult(int x) {
        System.out.println(x);
    }
}