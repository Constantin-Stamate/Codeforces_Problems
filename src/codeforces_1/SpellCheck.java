package codeforces_1;

import java.util.HashSet;
import java.util.Scanner;

public class SpellCheck {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s = scan.next();
            spellCheck(n, s);
        }
    }

    public static void spellCheck(int n, String s) {
        if (n != 5) System.out.println("NO");
        else {
            HashSet<Character> targetSet = spellTimur("Timur");
            HashSet<Character> spellSet = new HashSet<Character>();
            for (char c : s.toCharArray()) {
                spellSet.add(c);
            }

            if (spellSet.equals(targetSet)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static HashSet<Character> spellTimur(String a) {
        HashSet<Character> targetSet = new HashSet<>();
        for (char c : a.toCharArray()) {
            targetSet.add(c);
        }
        return targetSet;
    }
}
