package codeforces_2;

import java.util.Scanner;

public class TwoIntegers {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(findNumberOfMoves(a, b));
        }
    }

    public static int findNumberOfMoves(int a, int b) {
        int diff = Math.abs(b - a);
        return diff / 10 + (diff % 10 == 0 ? 0 : 1);
    }
}
