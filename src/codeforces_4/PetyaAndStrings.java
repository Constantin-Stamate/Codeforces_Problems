package codeforces_4;

import java.util.Scanner;

public class PetyaAndStrings {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = readString();
        String s2 = readString();

        int result = compareStrings(s1, s2);
        printResult(result);
    }

    private static String readString() {
        return sc.next();
    }

    private static int compareStrings(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        return s1.compareTo(s2);
    }

    private static void printResult(int result) {
        if (result < 0) System.out.println(-1);
        else if (result > 0) System.out.println(1);
        else System.out.println(0);
    }
}