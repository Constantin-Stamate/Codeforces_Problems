package codeforces_1;

import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] sir = readArray(n, scan);

        int minIndex = findMinIndex(sir);
        int maxIndex = findMaxIndex(sir);

        int moves = calculateMoves(n, minIndex, maxIndex);
        System.out.println(moves);
    }

    public static int[] readArray(int n, Scanner scan) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int findMinIndex(int[] arr) {
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] arr) {
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int calculateMoves(int n, int minIndex, int maxIndex) {
        if (minIndex < maxIndex) {
            return maxIndex + (n - minIndex - 2);
        } else {
            return maxIndex + (n - minIndex - 1);
        }
    }
}
