package codeforces_2;

import java.util.Scanner;

public class Bachgold {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primeDecompositionFactors(n);
    }

    public static void primeDecompositionFactors(int n) {
        if (n % 2 == 0) {
            System.out.println(n / 2);
            for (int i = 0; i < n / 2; i++) {
                System.out.print(2 + " ");
            }
        } else {
            System.out.println(n / 2);
            for (int i = 0; i < (n - 3) / 2; i++) {
                System.out.print(2 + " ");
            }
            System.out.print(3 + " ");
        }
    }
}
