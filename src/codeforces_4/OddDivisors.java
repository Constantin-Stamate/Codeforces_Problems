package codeforces_4;

import java.util.Scanner;

public class OddDivisors {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = readInt();
        System.out.println(countOddDivisors(n));
    }

    private static int readInt() {
        return sc.nextInt();
    }

    private static int countOddDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) count++;
        }
        return count;
    }
}