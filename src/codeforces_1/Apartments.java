package codeforces_1;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            System.out.println(sumOfApartments(n));
        }
    }

    public static int sumOfApartments(int n) {
        int sum = 0;
        int count = 1;
        int ind = 1;
        int evd = 1;

        while (count != n) {
            sum += evd;
            evd++;
            count = count * 10 + ind;

            if (count > 9999) {
                ind++;
                count = ind;
                evd = 1;
            }
        }
        return sum + evd;
    }
}
