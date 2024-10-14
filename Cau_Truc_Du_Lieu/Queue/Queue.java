package Queue;

import java.util.Iterator;

public class Queue<T> implements Iterable{
    public Node<T> first;

    public Iterator iterator(){
        return new iter();
    }

    public class iter implements Iterator{
        public Node<T> first = Queue.this.first;

        @Override
        public boolean hasNext() {
            return first != null;
        }

        @Override
        public Object next() {
            if(!hasNext()) throw new RuntimeException();

            T value = first.data;
            first = first.next;
            return value;
        }
    }

    public Queue() {
        first = null;
    }

    public int Size() {
        Node other = first;
        int count = 0;

        while (other != null) {
            count++;
            other = other.next;
        }

        return count;
    }


    public boolean isEmpty() {
        return first == null;
    }

    public boolean add(T value) {
        Node other = new Node(value);

        if (first == null) first = other;

        other.next = first;

        first = other;

        return  true;
    }

    public T pop(){
        if(isEmpty()) throw new RuntimeException();

        Node other = first;

        if(first.next == null){
            T value = first.data;
            first = null;
            return value;
        }

        while(other.next.next != null){
            other = other.next;
        }

        T value = (T) other.next.data;
        other.next = null;
        return value;
    }

    public T peek(){
        if(isEmpty()) throw new RuntimeException();

        return first.data;
    }
}
