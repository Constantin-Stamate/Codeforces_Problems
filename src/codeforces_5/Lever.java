package codeforces_5;

import java.util.Scanner;

public class Lever {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = readArraySize();
            int[] a = readArray(n);
            int[] b = readArray(n);
            System.out.println(computeIterations(a, b, n));
        }
    }

    private static int readArraySize() {
        return scan.nextInt();
    }

    private static int[] readArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    private static int computeIterations(int[] firstArray, int[] secondArray, int n) {
        int over = 0;

        for (int i = 0; i < n; i++) {
            if (firstArray[i] > secondArray[i]) {
                over += firstArray[i] - secondArray[i];
            }
        }

        return over + 1;
    }
}