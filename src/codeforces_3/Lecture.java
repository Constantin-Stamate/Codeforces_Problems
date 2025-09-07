package codeforces_3;

import java.util.*;

public class Lecture {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, String> dict = readDictionary(m);
        List<String> lecture = readLecture(n);
        List<String> notes = translateLecture(lecture, dict);
        printResult(notes);
    }

    private static Map<String, String> readDictionary(int m) {
        Map<String, String> dict = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String a = sc.next();
            String b = sc.next();

            if (b.length() < a.length()) {
                dict.put(a, b);
            } else {
                dict.put(a, a);
            }
        }
        return dict;
    }

    private static List<String> readLecture(int n) {
        List<String> lecture = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lecture.add(sc.next());
        }
        return lecture;
    }

    private static List<String> translateLecture(List<String> lecture, Map<String, String> dict) {
        List<String> result = new ArrayList<>();
        for (String word : lecture) {
            result.add(dict.get(word));
        }
        return result;
    }

    private static void printResult(List<String> notes) {
        for (int i = 0; i < notes.size(); i++) {
            System.out.print(notes.get(i));
            if (i < notes.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}