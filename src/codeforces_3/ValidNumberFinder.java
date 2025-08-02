package codeforces_3;

import java.util.Arrays;
import java.util.Scanner;

public class ValidNumberFinder {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] nums = readInputNumbers(n);
        Arrays.sort(nums);
        int result = findValidNumber(nums, k);
        System.out.println(result);
    }

    public static int[] readInputNumbers(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        return nums;
    }

    public static int findValidNumber(int[] nums, int k) {
        if (k == 0) {
            if (nums[0] == 1) {
                return -1;
            } else {
                return nums[0] - 1;
            }
        }

        if (k > nums.length) {
            return -1;
        }

        int candidate = nums[k - 1];
        int count = countLessOrEqual(nums, candidate);

        if (count == k) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static int countLessOrEqual(int[] nums, int value) {
        int count = 0;
        for (int num : nums) {
            if (num <= value) count++;
        }
        return count;
    }
}