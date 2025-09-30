package codeforces_4;

import java.util.Scanner;

public class NextRound {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = readInt();
        int k = readInt();
        int[] scores = readScores(n);
        int result = countQualifiers(scores, k);
        printResult(result);
    }

    private static int readInt() {
        return sc.nextInt();
    }

    private static int[] readScores(int n) {
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        return scores;
    }

    private static int countQualifiers(int[] scores, int k) {
        int threshold = scores[k - 1];
        int count = 0;
        for (int score : scores) {
            if (score >= threshold && score > 0) {
                count++;
            }
        }
        return count;
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}