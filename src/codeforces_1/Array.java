package codeforces_1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            balancedArray(n);
        }
    }

    public static void balancedArray(int n) {
        int x = 2;
        int s = 0;
        int y = 1;
        if ((n / 2) % 2 == 1) System.out.println("NO");
        else {
            System.out.println("YES");
            for (int j = 1; j <= n / 2; j++) {
                System.out.print(x + " ");
                s += x;
                x += 2;
            }
            for (int k = n / 2 + 1; k < n; k++) {
                System.out.print(y + " ");
                s -= y;
                y += 2;
            }
            System.out.println(s);
        }
    }
}
