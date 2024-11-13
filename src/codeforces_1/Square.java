package codeforces_1;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(minimumArea(a, b));
        }
    }

    public static int minimumArea(int a, int b) {
        int rez = 0;
        if (a >= b) rez = Math.max(a, b * 2);
        else rez = Math.max(a * 2, b);
        return (int) Math.pow(rez, 2);
    }
}
