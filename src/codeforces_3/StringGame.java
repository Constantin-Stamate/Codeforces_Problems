package codeforces_3;

import java.util.*;

public class StringGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = 1;
        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = computeSomething(arr);

        System.out.println(ans);
    }

    static int computeSomething(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }
}