package codeforces_4;

import java.util.*;

public class BoyOrGirl {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String username = sc.nextLine();
        int distinctCount = countDistinct(username);
        printResult(distinctCount);
    }

    private static int countDistinct(String s) {
        Set<Character> set = buildSet(s);
        return set.size();
    }

    private static Set<Character> buildSet(String s) {
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }

    private static void printResult(int count) {
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}