package codeforces_3;

import java.util.Scanner;

public class Cupboards {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int leftOpen = 0;
        int rightOpen = 0;

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            leftOpen += l;
            rightOpen += r;
        }

        int totalTime = calculateTotalTime(n, leftOpen, rightOpen);
        System.out.println(totalTime);
    }

    static int calculateTotalTime(int n, int leftOpen, int rightOpen) {
        int minLeftChanges = calculateMinChanges(n, leftOpen);
        int minRightChanges = calculateMinChanges(n, rightOpen);
        return minLeftChanges + minRightChanges;
    }

    static int calculateMinChanges(int n, int openCount) {
        int closedCount = n - openCount;
        return Math.min(openCount, closedCount);
    }
}