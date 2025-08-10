package codeforces_3;

import java.util.Scanner;

public class NumberTransformation {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int[] nums = findMultiplicationPair(x, y);
            System.out.println(nums[0] + " " + nums[1]);
        }
    }

    static int[] findMultiplicationPair(int x, int y) {
        if (x == y) {
            return new int[]{1, 1};
        }

        if (y % x != 0) {
            return new int[]{0, 0};
        }

        int ratio = y / x;

        for (int a = 1; a <= 31; a++) {
            double root = Math.pow(ratio, 1.0 / a);
            int b = (int) Math.round(root);

            if (b >= 1 && Math.pow(b, a) == ratio) {
                return new int[]{a, b};
            }
        }

        return new int[]{0, 0};
    }
}