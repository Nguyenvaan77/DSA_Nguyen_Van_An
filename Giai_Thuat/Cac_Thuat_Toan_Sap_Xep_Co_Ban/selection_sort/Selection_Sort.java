import java.util.List;
import java.util.Scanner;

public class Selection_Sort {
    public static void Swap_list(List<Integer> arr, int a, int b) {
        try {
            int other = arr.get(a);
            arr.set(a, arr.get(b));
            arr.set(b, other);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void selection_sort_list(List<Integer> arr) {
        int n = arr.size();
        int current_min = 0;
        for (int i = 0; i < n - 1; ++i) {
            current_min = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr.get(i) > arr.get((j))) {
                    current_min = j;
                }
            }
            if (current_min != i) {
                Swap_list(arr, current_min, i);
            }
        }
    }

    public static void Swap_Arr(int[] arr, int a, int b) {
        try {
            int other = arr[a];
            arr[a] = arr[b];
            arr[b] = other;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void selection_sort_arr(int[] arr) {
        int n = arr.length;
        int current_index = 0;
        for (int i = 0; i < n - 1; ++i) {
            current_index = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[current_index]) {
                    current_index = j;
                }
            }
            if (current_index != i) {
                Swap_Arr(arr, current_index, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[8];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<8;++i){
            arr[i] = sc.nextInt();
        }

        selection_sort_arr(arr);

        for (int element : arr){
            System.out.println(element);
        }
    }
}
