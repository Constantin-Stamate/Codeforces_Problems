package codeforces_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            System.out.println(sumOfNumbers(a).size());
            for (Integer num : sumOfNumbers(a)) {
                System.out.print(num + " ");
            }
        }
    }

    public static List<Integer> sumOfNumbers(int n) {
        int a = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (n != 0) {
            if (n % 10 != 0) list.add(n % 10 * a);
            a *= 10;
            n /= 10;
        }

        List<Integer> sum = list.stream()
                .toList()
                .reversed();

        return sum;
    }
}
