package codeforces_1;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(uniqueNumber(a, b, c));
        }
    }

    public static int uniqueNumber(int a, int b, int c) {
        if (a == b) return c;
        else if (a == c) return b;
        else return a;
    }
}
