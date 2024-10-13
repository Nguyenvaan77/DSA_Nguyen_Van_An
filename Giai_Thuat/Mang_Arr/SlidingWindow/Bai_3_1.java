package Mang_Arr.SlidingWindow;

import java.util.Scanner;

public class Bai_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int curSum = 0;
        int max_length = 0;
        int start = 0;
        int firstIndex = -1;
        int lastIndex = -1;
        int S = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int end = 0; end < n; ++end) {
            curSum += arr[end];

            while (curSum >= S) {
                curSum -= arr[start];
                ++start;
            }

            if (max_length < end - start + 1) {
                max_length = end - start + 1;
                firstIndex = start;
                lastIndex = end;
            }
        }

        System.out.println(max_length);
        if (max_length > 0) {
            for (int i = firstIndex; i <= lastIndex; ++i) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Khong co chuoi thao man");
        }
    }
}
