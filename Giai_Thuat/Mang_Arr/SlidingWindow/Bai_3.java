package Mang_Arr.SlidingWindow;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int S = sc.nextInt();
        int curSum = 0;
        int start = 0;

        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }

        for(int end=0;end<n;++end){
            curSum += arr[end];

            while(curSum >= S){
                curSum -= arr[end];
                ++start;
            }


        }
    }
}
