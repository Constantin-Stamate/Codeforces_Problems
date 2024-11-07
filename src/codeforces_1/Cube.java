package codeforces_1;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(heightOfThePyramid(n));
    }

    public static int heightOfThePyramid(int n) {
        int rez = 0, s = 1, p = 2;

        while (s <= n) {
            rez++;
            n -= s;
            s += p;
            p++;
        }
        return rez;
    }
}
