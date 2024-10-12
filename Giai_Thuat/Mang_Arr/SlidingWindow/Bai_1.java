import java.util.Scanner;

public class Bai_1 {
    public static int[] arr;
    public static int n;
    public static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int tong = 0;
        k = sc.nextInt();
        if (k > n) throw new RuntimeException("Gia tri K khong the be lon hon N");
        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < k; ++i) {
            tong += arr[i];
        }
        for (int i = 1; i <= n - k; ++i) {
            if (tong - arr[i - 1] + arr[i + k - 1] > tong) {
                tong = tong - arr[i - 1] + arr[i + k - 1];
            }
            System.out.println("i = "+ i + " Tong = " + tong);
        }
    }
}