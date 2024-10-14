# QUEUE (Hàng đợi)
Queue là cấu trúc dữ liệu hàng đợi, hoạt động theo cơ chế FIFO(Vào đầu ra đầu), nghĩa là phần tử được thêm vào đầu tiên sẽ được lấy ra đầu tiên.
## Các loại hàng đợi mà Java cung cấp
Java cung cấp rất nhiều loại hàng đợi, ví dụ có thể kể đến cá loại giao diện sau:
1. `Queue`
2. `Deque`
3. `PriorityQueue`
4. `LinkedList`
## Điểm chú ý
Queue là một giao diện(Interface) trong gói java.util.
## Các phương thức quan trọng của Queue API
1. `boolean add(E e)`
    +   **Thêm phần tử vào cuối** hàng đợi. Ví dụ queue_name.add(int 3)
    +   **`E e`** : phần tử `cần thêm`
    +   **`Trả về`** : `True` khi thêm thành công và Thả ngoại lệ Illegal khi không thêm được.
3. `T poll()`
    +   **`Loại bỏ và trả về giá trị của phần tử đầu tiên trong dãy`**
    +   Nếu hàng đợi rỗng thì kết quả trả về là `null`
4. `T peek()`
    +   **`Trả về giá trị đầu tiên của hàng đợi mà không loại bỏ nó`**
      +   Nếu hàng đợi rỗng thì kết quả trả về sẽ là `null`
