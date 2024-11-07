package codeforces_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Card {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = createArray(n);
        ArrayList<Integer> list = transformList(arr);
        int[] sir = numberOfPoints(list);
        displayArray(sir);
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static ArrayList<Integer> transformList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public static int[] numberOfPoints(ArrayList<Integer> list) {
        int count1 = 0, count2 = 0;
        boolean serejaTurn = true;
        while (!list.isEmpty()) {
            int left = list.get(0);
            int right = list.get(list.size() - 1);

            int chosenCard;
            if (left >= right) {
                chosenCard = left;
                list.remove(0);
            } else {
                chosenCard = right;
                list.remove(list.size() - 1);
            }

            if (serejaTurn) {
                count1 += chosenCard;
            } else {
                count2 += chosenCard;
            }

            serejaTurn = !serejaTurn;
        }
        return new int[]{count1, count2};
    }

    public static void displayArray(int[] sir) {
        for (int num : sir) {
            System.out.print(num + " ");
        }
    }
}
