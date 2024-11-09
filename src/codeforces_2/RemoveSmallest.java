package codeforces_2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    static Scanner scan  = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] arr = createArray(n);
            onlyOneElement(arr, n);
        }
    }

    public static int[] createArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        return a;
    }

    public static void onlyOneElement(int[] a, int n) {
        if (n == 1) System.out.println("YES");
        else {
            Arrays.sort(a);
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] > 1) {
                    possible = false;
                    break;
                }
            }
            if (possible) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
