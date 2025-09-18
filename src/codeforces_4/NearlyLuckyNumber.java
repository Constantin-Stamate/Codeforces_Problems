package codeforces_4;

import java.util.Scanner;

public class NearlyLuckyNumber {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String number = sc.nextLine();
        int luckyCount = countLuckyDigits(number);
        if (isLucky(luckyCount)) {
            printYes();
        } else {
            printNo();
        }
    }

    private static int countLuckyDigits(String num) {
        int count = 0;
        for (char c : num.toCharArray()) {
            if (c == '4' || c == '7') {
                count++;
            }
        }
        return count;
    }

    private static boolean isLucky(int num) {
        if (num == 0) return false;
        while (num > 0) {
            int d = num % 10;
            if (d != 4 && d != 7) return false;
            num /= 10;
        }
        return true;
    }

    private static void printYes() {
        System.out.println("YES");
    }

    private static void printNo() {
        System.out.println("NO");
    }
}