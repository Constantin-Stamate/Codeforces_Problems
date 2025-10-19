package codeforces_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Twice {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = readArraySize();
            int[] array = readArray(n);
            System.out.println(findMaxScore(array));
        }
    }

    private static int readArraySize() {
        return scan.nextInt();
    }

    private static int[] readArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int findMaxScore(int[] array) {
        int score = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int val : array) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        for (int count : freq.values()) {
            score += count / 2;
        }

        return score;
    }
}