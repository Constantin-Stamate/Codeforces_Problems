package codeforces_3;

import java.util.Scanner;

public class Army {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = createArray(n);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(numberOfYears(arr, a, b));
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int numberOfYears(int[] arr, int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            count += arr[i];
        }
        return count;
    }
}
