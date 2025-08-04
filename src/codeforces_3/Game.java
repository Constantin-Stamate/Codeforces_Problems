package codeforces_3;

import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println(countTransformationSteps(n, m));
    }

    public static int countTransformationSteps(int n, int m) {
        if (m % n != 0) {
            return -1;
        }

        int num = m / n;
        int count = 0;

        while (num % 2 == 0) {
            num /= 2;
            count++;
        }

        while (num % 3 == 0) {
            num /= 3;
            count++;
        }

        if (num != 1) {
            return -1;
        } else {
            return count;
        }
    }
}
