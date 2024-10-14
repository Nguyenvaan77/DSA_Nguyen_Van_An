package Stack;
public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0;i<5;++i){
            stack.push(i);
        }

        for(Object i : stack){
            System.out.println(i);
        }

    }
}
