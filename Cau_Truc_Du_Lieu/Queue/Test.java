package Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        for(int i=0;i<8;++i) queue.add(i);

        for(Integer i : queue){
            System.out.println(i);
        }
    }
}
