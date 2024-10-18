# String (Chuoi)

## Các cách `tách chuỗi` trong java
1.  `split()`
   - Phương thức split() của lớp String cho phép tách chuỗi dựa trên một biểu thức chính quy (regular expression). Để tách chuỗi dựa trên dấu cách, bạn có thể sử dụng biểu thức chính quy "\\s+" (một hoặc nhiều dấu cách).
   - **Ví dụ** 
   - ```java
      public class SplitExample {
      public static void main(String[] args) {
        String str = "This is a test string";
        String[] words = str.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
        }
        }
     ``` 
   - **Kết quả**
    This
    is
    a
    test
    string
   - **Lưu ý** : \\s+ là biểu thức chính quy để đại diện cho một hoặc nhiều dấu cách (bao gồm cả dấu cách, tab, dấu xuống dòng).
   - **Ưu điểm** : Đây là cách phổ biến để tách chuỗi, đặc biệt khi mà trong chuỗi có dấu cách, xuống dòng.
     1. Các phương thức nạp chồng split()
     ``` java
       String[] split(String regex)
       String[] split(String regex, int limit)
     ```
        + `regex` : Biểu thức chính quy dùng xác định điểm chia cắt. Ví dụ `String[] words = str.split(" ")` hay `String[] parts = str.split("[,;:]")`  chia cắt theo dấu , ; và :   .

