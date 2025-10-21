package codeforces_5;

import java.util.Scanner;

public class IncrementalSubmatrix {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = readNumber();
        for (int test = 0; test < t; test++) {
            int n = readNumber();
            int m = readNumber();
            int[] submatrix = readSubmatrix(m);
            System.out.println(countSubarrays(n, submatrix));
        }
    }

    private static int readNumber() {
        return scan.nextInt();
    }

    private static int[] readSubmatrix(int m) {
        int[] submatrix = new int[m];
        for (int i = 0; i < m; i++) {
            submatrix[i] = scan.nextInt();
        }
        return submatrix;
    }

    private static int countSubarrays(int n, int[] submatrix) {
        int m = submatrix.length;
        int result = 0;
        int currentIndex = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == submatrix[currentIndex]) {
                    currentIndex++;
                    if (currentIndex == m) {
                        result++;
                        currentIndex = 0;
                    }
                } else {
                    currentIndex = (j == submatrix[0]) ? 1 : 0;
                }
            }
        }

        return result;
    }
}