package codeforces_5;

import java.util.Scanner;

public class LetterHome {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int[] data = readProblemData();
            int n = data[0];
            int s = data[1];
            int[] array = readArray(n);
            System.out.println(findMinSteps(array, n, s));
        }
    }

    private static int[] readProblemData() {
        int n = scan.nextInt();
        int s = scan.nextInt();
        return new int[]{n, s};
    }

    private static int[] readArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int[] findMinMaxNumbers(int[] array, int n) {
        int minNumber = array[0];
        int maxNumber = array[0];
        for (int i = 1; i < n; i++) {
            minNumber = Math.min(minNumber, array[i]);
            maxNumber = Math.max(maxNumber, array[i]);
        }
        return new int[]{minNumber, maxNumber};
    }

    private static int findMinSteps(int[] array, int n, int s) {
        int[] minMax = findMinMaxNumbers(array, n);
        int minNumber = minMax[0];
        int maxNumber = minMax[1];
        return (maxNumber - minNumber) + Math.min(Math.abs(s - minNumber), Math.abs(s - maxNumber));
    }
}