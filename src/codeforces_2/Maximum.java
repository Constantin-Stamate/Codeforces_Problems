package codeforces_2;

import java.util.Scanner;

public class Maximum {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] arr = createArray(n);
            System.out.println(findMinimumNumber(arr, n));
        }
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int findMinimumNumber(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int maxPair = Math.max(arr[i], arr[i + 1]);
            min = Math.min(min, maxPair);
        }
        return min - 1;
    }
}
