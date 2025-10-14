package codeforces_5;

import java.util.Scanner;

public class ABCReorder {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            solveCase(s);
        }
    }

    private static void solveCase(String s) {
        if (canReorderToAvoidPalindromes(s)) System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean canReorderToAvoidPalindromes(String s) {
        if (s.length() == 1) return true;
        if (s.length() == 2) return s.charAt(0) != s.charAt(1);
        return false;
    }
}