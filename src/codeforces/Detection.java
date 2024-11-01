package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Detection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            list.add(findIndex(arr));
        }
        for (Integer i : list) {
            System.out.println(i);

        }
    }

    public static int findIndex(int[] arr) {
        int a = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                a = i;
                break;
            }
        }
        if (a == -1 && arr[0] != arr[1]) a = 0;
        if (a == -1 && arr[arr.length - 1] != arr[arr.length - 2]) a = arr.length - 1;
        return a + 1;
    }
}
