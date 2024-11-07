package codeforces1;

import java.util.Scanner;

public class Police {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = createArray(n);
        System.out.println(numberOfCrimes(n, arr));
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int numberOfCrimes(int n, int[] arr) {
        int count = 0, max = 999999;
        for (int i = 0; i < n; i++) {
            count += arr[i];
            if (count < max) max = count;
        }
        if (max > 0) return 0;
        return Math.abs(max);
    }
}
