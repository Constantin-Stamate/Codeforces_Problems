package codeforces_1;

import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            System.out.println(numberOfMoves(n, arr));
        }
    }

    public static int numberOfMoves(int n, int[] arr) {
        int count = 0;
        int par = 0, impar = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != i % 2) count++;
            if (arr[i] % 2 == 0) par++;
            else impar++;
        }
        if ((n % 2 == 0 && par != impar) || (n % 2 == 1 && par != impar + 1)) return -1;
        else if (count % 2 != 0) return -1;
        else return count / 2;
    }
}
