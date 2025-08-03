package codeforces_3;

import java.util.Scanner;

public class AlmostPrime {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (countDistinctPrimeDivisors(i) == 2) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static int countDistinctPrimeDivisors(int x) {
        int distinctCount = 0;
        int temp = x;

        for (int i = 2; i <= temp / i; i++) {
            if (temp % i == 0) {
                distinctCount++;
                while (temp % i == 0) {
                    temp /= i;
                }
            }
        }

        if (temp > 1) {
            distinctCount++;
        }

        return distinctCount;
    }
}