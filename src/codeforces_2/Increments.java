package codeforces_2;

import java.util.Scanner;

public class Increments {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] arr = createArray(n);
            onlySameNumbers(arr, n);
        }
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void onlySameNumbers(int[] arr, int n) {
        int pozImpareImp = 0, pozImparePar = 0, pozPareImp = 0, pozParePar = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 == 0) {
                    pozParePar++;
                }
                else pozPareImp++;
            }
            else {
                if (arr[i] % 2 == 0) {
                    pozImparePar++;
                }
                else pozImpareImp++;
            }
        }
        if ((pozImparePar > 0 && pozImpareImp > 0) || (pozPareImp > 0 && pozParePar > 0)) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
