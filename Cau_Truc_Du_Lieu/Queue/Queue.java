package Queue;

import java.util.Iterator;

import Node.Node;
import Stack.*;

public class Queue<T> implements Iterable<T> {
    public Node<T> first;

    @Override
    public Iterator<T> iterator() {
        return new Iter();
    }

    public class Iter implements Iterator<T> {
        private Node<T> current;

        // Khởi tạo iterator, bắt đầu từ phần tử đầu tiên được thêm vào
        public Iter() {
            // Để duyệt theo đúng thứ tự FIFO, ta cần tìm đến phần tử đầu tiên
            current = getOldestNode();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new RuntimeException("No more elements");
            }

            T value = current.data;
            current = current.next; // Di chuyển đến phần tử tiếp theo
            return value;
        }

        // Phương thức để tìm đến phần tử "cũ nhất" trong danh sách
        private Node<T> getOldestNode() {
            if (first == null) {
                return null;
            }

            Node<T> current = first;
            // Duyệt đến phần tử cuối cùng của danh sách (phần tử đầu tiên đã thêm vào)
            while (current.next != null) {
                current = current.next;
            }
            return current;
        }
    }
    public Queue() {
        first = null;
    }

    public Node<T> backtracking_list() {
        if (first == null) return null;

        Stack<T> stack = new Stack<T>();

        Node<T> other = first;

        while (other != null) {
            stack.push((T) other);
            other = other.next;
        }

        return stack.peekNode();
    }

    public int Size() {
        Node<T> other = first;
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

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        Node<T> current = first;

        if (first.next == null) {
            T value = first.data;
            first = null;
            return value;
        }

        while (current.next.next != null) {
            current = current.next;
        }

        T value = current.next.data;
        current.next = null;
        return value;
    }

    public T peekData() {
        if (isEmpty()) throw new RuntimeException();

        Node<T> other = first;

        while (other.next != null) {
            other = other.next;
        }

        return (T) other.data;
    }

    public Node<T> peekNode() {
        if (isEmpty()) throw new RuntimeException();

        Node<T> other = first;

        while (other.next != null) {
            other = other.next;
        }

        return other;
    }
}
