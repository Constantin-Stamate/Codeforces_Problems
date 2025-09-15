package codeforces_4;

import java.util.*;

public class HelpfulMaths {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.nextLine();
        List<Integer> numbers = parseNumbers(input);
        sortNumbers(numbers);
        String result = buildResult(numbers);
        printResult(result);
    }

    private static List<Integer> parseNumbers(String input) {
        List<Integer> list = new ArrayList<>();
        for (String part : input.split("\\+")) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }

    private static void sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    private static String buildResult(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                sb.append("+");
            }
        }
        return sb.toString();
    }

    private static void printResult(String result) {
        System.out.println(result);
    }
}