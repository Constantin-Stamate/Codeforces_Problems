package codeforces_2;

import java.util.Scanner;

public class RequiredRemainder {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(maximumNumber(x, y, n));
        }
    }

    public static int maximumNumber(int x, int y, int n) {
        int count = (n - y) / x;
        return count * x + y;
    }
}
