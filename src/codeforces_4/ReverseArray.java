package codeforces_4;

import java.util.Scanner;

public class ReverseArray {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = readArray();
        reverse(arr);
        printArray(arr);
    }

    private static int[] readArray() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    private static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
    }
}