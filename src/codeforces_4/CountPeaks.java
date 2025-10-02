package codeforces_4;

import java.util.Scanner;

public class CountPeaks {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = readArray();
        System.out.println(countPeaks(arr));
    }

    private static int[] readArray() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static int countPeaks(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++)
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) count++;
        return count;
    }
}