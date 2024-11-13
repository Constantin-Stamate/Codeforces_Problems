package codeforces_2;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scan.next();
            System.out.println(frequencyTotalOfCharacters(s));
        }
    }

    public static Character frequencyTotalOfCharacters(String s) {
        int frequency = 0;
        char w = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character key : map.keySet()) {
            if (map.get(key) > frequency) {
                frequency = map.get(key);
                w = key;
            }
        }
        return w;
    }
}
