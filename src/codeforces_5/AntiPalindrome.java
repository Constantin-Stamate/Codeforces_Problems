package codeforces_5;

import java.util.*;

public class AntiPalindrome {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            solveCase(s);
        }
    }

    private static void solveCase(String s) {
        if (!canBeAntiPalindrome(s)) {
            System.out.println(-1);
        } else {
            System.out.println(countSwapsToAnti(s));
        }
    }

    private static boolean canBeAntiPalindrome(String s) {
        if (s.length() % 2 == 1) return false;
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        int half = s.length() / 2;
        for (int f : freq) if (f > half) return false;
        return true;
    }

    private static int countSwapsToAnti(String s) {
        int n = s.length();
        int[] freq = new int[26];
        Map<Character, Integer> mirrorFreq = new HashMap<>();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                char c = s.charAt(i);
                mirrorFreq.put(c, mirrorFreq.getOrDefault(c, 0) + 1);
            }
            freq[s.charAt(i) - 'a']++;
            freq[s.charAt(n - i - 1) - 'a']++;
        }

        int max = 0, totalPairs = 0;
        for (int val : mirrorFreq.values()) {
            max = Math.max(max, val);
            totalPairs += val;
        }

        return Math.max(max, (totalPairs + 1) / 2);
    }
}