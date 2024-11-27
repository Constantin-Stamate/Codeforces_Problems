package codeforces_2;

import java.util.Scanner;

public class Numbers {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = createArray(n);
        System.out.println(numbers(n, k, arr));
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int numbers(int n, int k, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int s = 0;
            while (arr[i] != 0) {
                if (arr[i] % 10 == 4 || arr[i] % 10 == 7) s++;
                arr[i] /= 10;
            }
            if (s <= k) count++;
        }
        return count;
    }
}
