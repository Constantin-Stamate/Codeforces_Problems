package codeforces_4;

import java.util.Scanner;

public class WayTooLongWords {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            System.out.println(abbreviate(word));
        }
    }

    private static String abbreviate(String word) {
        if (word.length() > 10) {
            return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        }
        return word;
    }
}