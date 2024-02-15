# Tóm tắt đề bài "Tìm thùng chứa nước có dung tích lớn nhất":

## I. Mô tả:

Cho một mảng height gồm các số nguyên, mỗi số đại diện cho chiều cao của một đường thẳng đứng. Hãy tìm hai đường thẳng trong mảng để tạo thành một thùng chứa có thể chứa được lượng nước tối đa.

## II. Đầu vào:

Mảng height gồm các số nguyên dương.
Đầu ra:

Diện tích tối đa của thùng chứa nước được tạo thành bởi hai đường thẳng trong mảng.
Ràng buộc:

1 <= height.length <= 2 * 10^4
1 <= height[i] <= 10^5
Ví dụ:

Đầu vào: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
Đầu ra: 49

## III. Giải pháp:

Sử dụng phương pháp hai con trỏ để lặp qua tất cả các cặp đường thẳng. Tính toán diện tích của thùng chứa được tạo thành bởi mỗi cặp đường thẳng và cập nhật diện tích tối đa nếu cần thiết.

## IV. Độ phức tạp:

Thời gian: O(n)
Không gian: O(1)
