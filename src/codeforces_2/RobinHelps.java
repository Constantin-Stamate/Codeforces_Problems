package codeforces_2;

import java.util.Scanner;

public class RobinHelps {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = createArray(n);

            System.out.println(numberOfPeople(n, arr, k));
        }
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int numberOfPeople(int n, int[] arr, int k) {
        int count = 0;
        int rez = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) count += arr[i];
            else if (arr[i] == 0 && count >= 1) {
                count--;
                rez++;
            }
        }
        return rez;
    }
}
