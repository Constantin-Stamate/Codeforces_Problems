package codeforces_2;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(determineNewString(n));
    }

    public static String determineNewString(int n) {
        StringBuilder rez = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (isFibonacci(i)) {
                rez.append("O");
            } else {
                rez.append("o");
            }
        }
        return rez.toString();
    }

    public static boolean isFibonacci(int x) {
        return isPerfectSquare(5 * x * x + 4) || isPerfectSquare(5 * x * x - 4);
    }

    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }
}
