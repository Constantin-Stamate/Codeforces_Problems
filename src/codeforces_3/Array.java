package codeforces_3;

import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(minSumAfterOperations(a));
        }
    }

    static int minSumAfterOperations(int[] a) {
        int result = 0;
        for (int val : a) {
            result |= val;
        }
        return result;
    }
}