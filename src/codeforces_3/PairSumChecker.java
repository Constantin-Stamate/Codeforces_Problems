package codeforces_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairSumChecker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (hasPairWithSum(arr, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean hasPairWithSum(int[] arr, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(k - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}