package codeforces_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = createArray(n);
        ArrayList<Integer> list = getUniqueElements(n, arr);
        Collections.reverse(list);
        System.out.println(list.size());
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static ArrayList<Integer> getUniqueElements(int n, int[] arr) {
        HashSet<Integer> visited = new HashSet<>();
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (!visited.contains(arr[i])) {
                uniqueElements.add(arr[i]);
                visited.add(arr[i]);
            }
        }
        return uniqueElements;
    }
}
