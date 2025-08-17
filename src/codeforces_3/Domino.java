package codeforces_3;

import java.util.Scanner;

public class Domino {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(maxDominoes(m, n));
    }

    static int maxDominoes(int m, int n) {
        return (m * n) / 2;
    }
}
