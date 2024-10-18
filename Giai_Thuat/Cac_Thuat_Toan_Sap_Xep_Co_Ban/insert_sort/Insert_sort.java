import java.util.Scanner;

public class Insert_sort {
    public static void insert_sort_arr(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                --j;
            }

            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[8];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<8;++i){
            arr[i] = sc.nextInt();
        }

        insert_sort_arr(arr);

        for (int i = 0; i < 8; i++) {
            System.out.println(arr[i]);
        }
    }
}
