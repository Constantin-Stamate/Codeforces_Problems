package codeforces_4;

import java.util.Scanner;

public class IQTest {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] nums = readArray(n);
        System.out.println(findOddOneOut(nums));
    }

    private static int[] readArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static int findOddOneOut(int[] arr) {
        int evenCount = countEven(arr);
        boolean lookingForOdd = evenCount > 1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) != lookingForOdd) return i + 1;
        }
        return -1;
    }

    private static int countEven(int[] arr) {
        int cnt = 0;
        for (int x : arr) if (x % 2 == 0) cnt++;
        return cnt;
    }
}