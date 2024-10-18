package Mang_Arr.SlidingWindow;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int start = 0;
        int lengt_max = 0;
        String string_max = "";
        Set<Character> set = new HashSet<>();
        int n = str.length();

        for (int end = 0; end < n; ++end) {
            Character word = str.charAt(end);

            while (set.contains(word)) {
                set.remove(str.charAt(start));
                ++start;
            }

            set.add(word);

            if (lengt_max < end - start + 1) {
                string_max = str.substring(start, end + 1);
                lengt_max = end - start + 1;
            }
        }

        System.out.println(string_max);
        System.out.println(lengt_max);
    }
}
