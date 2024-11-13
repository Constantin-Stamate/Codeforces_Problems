package codeforces_2;

import java.util.Scanner;

public class ArithmeticArray {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] arr = createArray(n);
            System.out.println(numberOfOperations(arr, n));
        }
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int numberOfOperations(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum == n) {
            return 0;
        } else if (sum < n) {
            return 1;
        } else {
            return sum - n;
        }
    }
}
