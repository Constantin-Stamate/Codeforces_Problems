package codeforces_3;

import java.util.Scanner;

public class DigitMinimization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            System.out.println(applyTransformations(a));
        }
    }

    public static int applyTransformations(int n) {
        if (n < 100) return n % 10;
        else {
            int min = n % 10;
            n /= 10;
            while (n != 0) {
                if (n % 10 < min) min = n % 10;
                n /= 10;
            }
            return min;
        }
    }
}
