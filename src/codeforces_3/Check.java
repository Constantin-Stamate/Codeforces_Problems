package codeforces_3;

import java.util.Scanner;

public class Check {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            System.out.println(shorten(word));
        }
    }

    static String shorten(String word) {
        if (word.length() > 10) {
            return "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
        }
        return word;
    }
}