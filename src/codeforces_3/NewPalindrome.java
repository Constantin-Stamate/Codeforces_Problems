package codeforces_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NewPalindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            if (canMakeDifferentPalindrome(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean canMakeDifferentPalindrome(String s) {
        int n = s.length();
        Set<Character> distinct = new HashSet<>();

        for (char c : s.toCharArray()) {
            distinct.add(c);
        }

        if (distinct.size() == 1) {
            return false;
        }

        if (n % 2 == 1) {
            int mid = n / 2;
            String withoutMiddle = s.substring(0, mid) + s.substring(mid + 1);
            Set<Character> distinctWithoutMiddle = new HashSet<>();

            for (char c : withoutMiddle.toCharArray()) {
                distinctWithoutMiddle.add(c);
            }

            return distinctWithoutMiddle.size() != 1;
        }

        return true;
    }
}