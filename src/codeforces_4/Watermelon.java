package codeforces_4;

import java.util.Scanner;

public class Watermelon {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int w = readInt();
        printResult(w);
    }

    private static int readInt() {
        return sc.nextInt();
    }

    private static boolean canSplit(int w) {
        return w > 2 && w % 2 == 0;
    }

    private static void printResult(int w) {
        if (canSplit(w)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}