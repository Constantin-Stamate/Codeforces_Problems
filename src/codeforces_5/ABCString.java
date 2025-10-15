package codeforces_5;

import java.util.Scanner;

public class ABCString {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            solveCase(s);
        }
    }

    private static void solveCase(String s) {
        if (isValidAssignment(s)) System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean isValidAssignment(String s) {
        char[] brackets = {'(', ')'};
        for (char a : brackets)
            for (char b : brackets)
                for (char c : brackets)
                    if (checkMapping(s, a, b, c))
                        return true;
        return false;
    }

    private static boolean checkMapping(String s, char mapA, char mapB, char mapC) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == 'A') sb.append(mapA);
            else if (ch == 'B') sb.append(mapB);
            else sb.append(mapC);
        }
        return isBalanced(sb.toString());
    }

    private static boolean isBalanced(String str) {
        int balance = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }
}