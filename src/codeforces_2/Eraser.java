package codeforces_2;

import java.util.Scanner;

public class Eraser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            scan.nextLine();
            String s = scan.next();
            System.out.println(numberOfOperations(n, k, s));
        }
    }

    public static int numberOfOperations(int n, int k, String s) {
        int count = 0;
        StringBuilder rez = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            if (rez.charAt(i) == 'B') {
                for (int j = 0; j < k; j++) {
                    if (i + j < n) rez.setCharAt(i + j, 'W');
                    else break;
                }
                count++;
            }
        }
        return count;
    }
}
