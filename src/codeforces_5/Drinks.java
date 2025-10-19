package codeforces_5;

import java.util.Scanner;

public class Drinks {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        double[] p = readPercentages(n);
        System.out.printf("%.12f%n", average(p));
    }

    private static double[] readPercentages(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextDouble();
        return arr;
    }

    private static double average(double[] arr) {
        double sum = 0;
        for (double x : arr) sum += x;
        return sum / arr.length;
    }
}