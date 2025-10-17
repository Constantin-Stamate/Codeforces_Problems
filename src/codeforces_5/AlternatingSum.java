package codeforces_5;

import java.util.Scanner;

public class AlternatingSum {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = readArraySize();
            int[] array = readArray(n);
            System.out.println(calculateAlternateSum(array, n));
        }
    }

    private static int readArraySize() {
        return scan.nextInt();
    }

    private static int[] readArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int calculateAlternateSum(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            } else {
                sum -= array[i];
            }
        }
        return sum;
    }
}