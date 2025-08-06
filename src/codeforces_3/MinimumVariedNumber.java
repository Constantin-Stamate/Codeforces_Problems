package codeforces_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumVariedNumber {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            findMinimumUniqueDigitSum(n);
        }
    }

    public static void findMinimumUniqueDigitSum(int n) {
        List<Integer> digits = new ArrayList<>();

        for (int i = 9; i > 0; i--) {
            if (n >= i) {
                digits.add(i);
                n -= i;
            }
        }

        Collections.sort(digits);

        for (Integer digit : digits) {
            System.out.print(digit);
        }

        System.out.println();
    }
}
