import java.util.Random;

public class Test {
    public static void main(String[] args) {
        long count = 1;
        final long target = 100;
        double result = 0;

        while(count != target + 1){
            int n = 0;

            Random rd = new Random();

            n = rd.nextInt(1000) + 1;

            int[] arr_1 = new int[n];
            int[] arr_2 = new int[n];

            int value = 0;

            for (int i = 0; i < n; ++i) {
                value = rd.nextInt(n) + 1;
                arr_1[i] = value;
                arr_2[i] = value;
            }

            long start = 0;
            long result_insert_sort = 0;
            long result_select_sort = 0;

            start = System.nanoTime();

            Insert_sort.insert_sort_arr(arr_1);

            result_insert_sort = System.nanoTime() - start;

            start = System.nanoTime();

            Selection_Sort.selection_sort_arr(arr_2);

            result_select_sort = System.nanoTime() - start;

            result = ((result * (int)(count - 1)) + (double)((double)result_insert_sort/result_select_sort )/count);

            ++count;
        }

        System.out.println(result);

    }
}
