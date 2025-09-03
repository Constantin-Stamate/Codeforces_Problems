package codeforces_3;

import java.util.*;

public class LectureNotes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, String> dict = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String a = sc.next();
            String b = sc.next();
            dict.put(a, b);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            result.append(getBestWord(word, dict));
            if (i < n - 1) result.append(" ");
        }

        System.out.println(result.toString());
    }

    static String getBestWord(String word, Map<String, String> dict) {
        String word2 = dict.get(word);
        if (word2.length() < word.length()) {
            return word2;
        } else {
            return word;
        }
    }
}