package codeforces_4;

import java.util.Scanner;

public class MaxDifference {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = readArray();
        System.out.println(maxDiff(arr));
    }

    private static int[] readArray() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static int maxDiff(int[] arr) {
        int maxDiff = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff > maxDiff) maxDiff = diff;
        }
        return maxDiff;
    }
}