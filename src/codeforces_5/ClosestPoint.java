package codeforces_5;

import java.util.*;

public class ClosestPoint {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = readNumber();
        for (int test = 0; test < t; test++) {
            int n = readNumber();
            int[] points = readArray(n);
            System.out.println(canAddClosestPoint(points, n) ? "YES" : "NO");
        }
    }

    private static int readNumber() {
        return scan.nextInt();
    }

    private static int[] readArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static boolean canAddClosestPoint(int[] points, int n) {
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) d[i] = points[1] - points[0];
            else if (i == n - 1) d[i] = points[n - 1] - points[n - 2];
            else d[i] = Math.min(points[i] - points[i - 1], points[i + 1] - points[i]);
        }

        int L = Integer.MIN_VALUE;
        int R = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            L = Math.max(L, points[i] - d[i]);
            R = Math.min(R, points[i] + d[i]);
        }

        if (L > R) return false;

        Set<Integer> set = new HashSet<>();
        for (int x : points) set.add(x);

        for (int p = L; p <= R; p++) {
            if (!set.contains(p)) return true;
        }

        return false;
    }
}