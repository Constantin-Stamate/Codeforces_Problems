package codeforces_2;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = createArray(n);
        System.out.println(numberOfSeconds(arr));
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int numberOfSeconds(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            if (i != 0) set.add(i);
        }
        return set.size();
    }
}
