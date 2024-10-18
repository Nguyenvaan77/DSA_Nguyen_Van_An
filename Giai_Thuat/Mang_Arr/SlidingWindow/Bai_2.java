package Mang_Arr.SlidingWindow;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int start = 0;
        int lengt_max = 0;
        int n = str.length();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            Character word = str.charAt(i);

            while (set.contains(word)) {
                set.remove(word);
                ++start;
            }

            set.add(word);

            if (lengt_max < i - start + 1) {
                lengt_max = i - start + 1;
            }
        }

        System.out.println(lengt_max);
    }
}
