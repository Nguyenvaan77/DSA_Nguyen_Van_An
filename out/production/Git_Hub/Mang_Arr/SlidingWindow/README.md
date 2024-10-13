# Cửa sổ trượt (Sliding window)
Là kĩ thuật lập trình hiệu quả khi sử dụng để làm việc với các kiểu dữ liệu như `mảng` hoặc `chuỗi`, đặc biệt được sử dụng nhiều nhất xử lí các đoạn con có kích thước cố định hoặc bất định

## Ý tưởng
Kỹ thuật cửa sổ trượt hoạt động bằng cách lướt 1 cửa sổ tương có kích thước cố đinh hoặc thay đổi, chúng ta sẽ duyệt của sổ theo thứ tự từ trái sang phải kết hợp với điều kiện bài toán lên để giải quyết với mỗi lần cập nhật cửa sổ đến hết mảng. Bằng cách này thay vì phải duyệt lần lượt các phần tử con trong đoạn thì chúng ta sẽ chỉ cần sử lí bài toán mỗi khi phần tử mới được thêm vào khi cửa sổ duyệt đến

### `Ví dụ : `
1. Tìm tổng lớn nhất của dãy con gồm k phần tử :
    1. Với những ai thấy còn mới chưa biết về kĩ thuật 2 con trỏ thì điều đầu tiên họ sẽ nghĩ tới kĩ thuật Code trâu hay duyệt trâu với tinh thần ta sẽ duyệt lần lượt từ đầu đến phần tử thứ n - k rồi tiếp tực duyệt k phần tử từ vị trí n - k để tính tổng từng đoạn. Điều đó sẽ tốn trung bình của chương trình là `O(n*k)`;
    2. Với kĩ thuật 2 con trỏ, chúng ta sẽ bắt đầu với tổng các phần tử từ 0 đến k - 1 của mảng, rồi tiến hành cho cửa sổ trượt, mỗi lần cửa sổ trượt thêm 1 phần tử, thì tổng sẽ được cập nhật : tổng cộng thêm phần tử mới được đưa vào và trừ phần từ bị đẩy ra khỏi cửa sổ. Qua đó chương trình của chúng ta sẽ chỉ tồn trung binh `O(n)` thay vì O(n*k);
    3. Mã giả
   ```python
    def max_sum_subarray(arr, k):
    # Tính tổng của cửa sổ đầu tiên
    max_sum = sum(arr[:k])
    window_sum = max_sum

    # Trượt cửa sổ trên mảng
    for i in range(len(arr) - k):
        # Cập nhật tổng của cửa sổ: trừ phần tử đầu tiên, cộng phần tử tiếp theo
        window_sum = window_sum - arr[i] + arr[i + k]
        # Cập nhật tổng lớn nhất nếu cần
        max_sum = max(max_sum, window_sum)
    
    return max_sum
   ```
## Áp dụng 
1. Khi bạn cần tính toán trên đoạn cố định của Mảng hãy 1 chuỗi 
2. Khi cần tối ưu hóa cho các bài toàn xử lí trên dãy con liên tiếp của 1 mảng

## Coding

1. [Bai_1 : Tìm tổng lớn nhất của dãy con liên tiếp có độ dài cố định](file:///Giai_Thuat/Mang_Arr/SlidingWindow/Bai_1.java)
    + Bài toán: Cho một mảng số nguyên và một số k, tìm tổng lớn nhất của dãy con liên tiếp gồm k phần tử.
2. [Bai_2 :Tìm độ dài chuỗi con có các kí tự khác nhau lớn nhất](file:///Giai_Thuat/Mang_Arr/SlidingWindow/Bai_2.java)
    + Bài toán: Cho 1 chuỗi kĩ tự nhập vào String, tìm số k là độ dài dài nhất của chuỗi con các kí tự khác nhau.
3. [Bai_2_1 : Tìm độ dài và chuỗi có các kí tự khác nhau dài nhất](file:///Giai_Thuat/Mang_Arr/SlidingWindow/Bai_2_1.java)
    + Đầu vào như bài 2, in ra độ dài và chuỗi đó.
4. []