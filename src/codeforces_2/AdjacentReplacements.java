package codeforces_2;

import java.util.Scanner;

public class AdjacentReplacements {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = createArray(n);
        applyTheChanges(arr, n);
        displayArray(arr, n);
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void applyTheChanges(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) arr[i]--;
        }
    }

    public static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
