package codeforces_4;

import java.util.Scanner;

public class SumOfEvens {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = readArray();
        System.out.println(sumEvens(arr));
    }

    private static int[] readArray() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static int sumEvens(int[] arr) {
        int sum = 0;
        for (int x : arr) if (x % 2 == 0) sum += x;
        return sum;
    }
}