package codeforces_3;

import java.util.Scanner;

public class Watermelon {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int w = readInput();
        String result = solve(w);
        printResult(result);
    }

    private static int readInput() {
        return scanner.nextInt();
    }

    private static String solve(int w) {
        if (w > 2 && w % 2 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static void printResult(String result) {
        System.out.println(result);
    }
}