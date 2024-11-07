package codeforces_1;

import java.util.Scanner;

public class Username {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = createdArray(n);
        System.out.println(numberOfPerformances(n, arr));
    }

    public static int[] createdArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int numberOfPerformances(int n, int[] arr) {
        int count = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) count++;
            else if (arr[i] > max) count++;

            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return count;
    }
}
