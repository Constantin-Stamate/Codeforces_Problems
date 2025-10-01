package codeforces_4;

import java.util.Scanner;

public class SumOfDigits {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = readNumber();
        int sum = calculateSum(number);
        String result = formatResult(sum);
        printResult(result);
    }

    private static int readNumber() {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    private static int calculateSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static String formatResult(int sum) {
        return "Sum of digits: " + sum;
    }

    private static void printResult(String result) {
        System.out.println(result);
    }
}