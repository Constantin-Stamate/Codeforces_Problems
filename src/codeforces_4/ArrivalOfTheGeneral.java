package codeforces_4;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] heights = readHeights(n);
        System.out.println(minMoves(heights));
    }

    private static int[] readHeights(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static int minMoves(int[] arr) {
        int maxIdx = findMaxIndex(arr);
        int minIdx = findMinIndex(arr);
        int moves = maxIdx + (arr.length - 1 - minIdx);
        if (maxIdx > minIdx) moves--;
        return moves;
    }

    private static int findMaxIndex(int[] arr) {
        int max = arr[0], idx = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        return idx;
    }

    private static int findMinIndex(int[] arr) {
        int min = arr[0], idx = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= min) {
                min = arr[i];
                idx = i;
            }
        return idx;
    }
}