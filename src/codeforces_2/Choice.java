package codeforces_2;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            determineWhether(a, b, c);
        }
    }

    public static void determineWhether(int a, int b, int c) {
        if (a < b && b < c) System.out.println("STAIR");
        else if (a < b && b > c) System.out.println("PEAK");
        else System.out.println("NONE");
    }
}
