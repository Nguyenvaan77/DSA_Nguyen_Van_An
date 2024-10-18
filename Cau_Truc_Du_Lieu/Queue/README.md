# QUEUE (Hàng đợi)
Queue là cấu trúc dữ liệu hàng đợi, hoạt động theo cơ chế FIFO(Vào đầu ra đầu), nghĩa là phần tử được thêm vào đầu tiên sẽ được lấy ra đầu tiên.
## Các loại hàng đợi mà Java cung cấp
Java cung cấp rất nhiều loại hàng đợi, ví dụ có thể kể đến cá loại giao diện sau:
1. `Queue`
2. `Deque`
3. `PriorityQueue`
4. `LinkedList`
## Điểm chú ý
Các lớp triển khai Queue

![](Images/classtrienkhaiinterface.png)

Queue là một giao diện(Interface) trong gói java.util.
## Các phương thức quan trọng của Queue API
1. `boolean add(E e)`
    +   **Thêm phần tử vào cuối** hàng đợi. Ví dụ queue_name.add(int 3)
    +   **`E e`** : phần tử `cần thêm`
    +   **`Trả về`** : `True` khi thêm thành công và Thả ngoại lệ Illegal khi không thêm được.
3. `T pop()`
    +   **`Loại bỏ và trả về giá trị của phần tử đầu tiên trong dãy`**
    +   Nếu hàng đợi rỗng thì kết quả trả về là `null`
4. `T peek()`
    +   **`Trả về giá trị đầu tiên của hàng đợi mà không loại bỏ nó`**
      +   Nếu hàng đợi rỗng thì kết quả trả về sẽ là `null`
## `Các giao diện Interface mở rộng đáng chú ý của Hàng đợi`
1. `PriorityQueue `
    + **Mô tả**: Hàng đợi ưu tiên, các phần tử được sắp xếp theo thứ tự tự nhiên hoặc theo bộ so sánh tùy chỉnh.
    + **Đặc điểm**: Không đảm bảo theo cấu trúc LIFO, xử lí các phần tử ưu tiên trước.
    + **Mã khởi tạo** :
   ```java
      Queue<Integer> queue = new PriorityQueue<>();
   ```
2. `LinkedList`
    + Linkedlist thực thi cả Deque và Queue. sử dụng danh sách liên kết hoạt như 1 hàng đợi hoặc 1 ngăn xếp tùy biến.
    + Có thể xử lí ở cả 2 đầu
    + **Mã khởi tạo***:
    ```java
        Queue<Integer> queue = new LinkedList<>();
    ```
3. `ArayDeque`
    + Hỗ trợ bằng mảng đầu và có thể thao tác từ 2 đầu.
    + Hiệu suất cao hơn LinkedList trong hầu hết các thao tác.
    + **Mã khởi tạo**:
   ```java
   Queue<E> queue = new ArrayDeQue<E>();
    ```