package Stack;

import java.util.*;
import java.util.Stack;

public class Test {
    public static long largestRectangle(List<Integer> h) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();

        long list_size = h.size();
        long n = 1;
        long height_min = Integer.MAX_VALUE;
        long max_area = 0;

        while(!stack.isEmpty()){
            long height = stack.pop();

            if(height < height_min) height_min = height;

            if(height_min * n > max_area){
                max_area = height_min * n;
            }

            ++n;
        }

        Iterator<Integer> iter = h.iterator();

        return max_area;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;++i){
            arr.add(sc.nextInt());
        }

        System.out.println(Test.largestRectangle(arr));
    }
}
