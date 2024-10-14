package Stack;

public class Stack<T> {
    public Node<T> first;
    public Stack() {
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int Size() {
        Node other = first;
        int n = 0;
        while(other != null){
            other = other.next;
            ++n;
        }
        return n;
    }

    public void push(T value){
        Node other = new Node<>(value);

        if(first == null){
            first = other;
            return;
        }

        other.next = first;
        first = other;
    }

    public T pop(){
        if(isEmpty()) throw new IllegalArgumentException();

        T value = (T) first.data;

        first = first.next;

        return value;
    }

    public T peek(){
        if(isEmpty()) throw new IllegalArgumentException();

        return (T) first.data;
    }

    public boolean search(T value){
        Node other = first;
        while(other != null){
            if(other.data == value){
                return true;
            }
            other = other.next;
        }
        return false;
    }


}
