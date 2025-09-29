package codeforces_4;

import java.util.Scanner;

public class MinMaxElement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solveCase();
        }
    }

    static void solveCase() {
        long n = sc.nextLong();
        long k = sc.nextLong();

        if (n % k == 0) {
            System.out.println(1);
            return;
        }

        long m = ceilDiv(n, k);
        long target = m * k;
        long ans = ceilDiv(target, n);

        System.out.println(ans);
    }

    static long ceilDiv(long a, long b) {
        return (a + b - 1) / b;
    }
}