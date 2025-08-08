package codeforces_3;

import java.util.Scanner;

public class CloudberryJam {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            System.out.println(findMuraKilograms(n));
        }
    }

    public static int findMuraKilograms(int n) {
        return n * 2;
    }
}
