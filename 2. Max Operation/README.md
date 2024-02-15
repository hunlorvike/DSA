# Tóm tắt đề bài: Tìm số lần tối đa chúng ta có thể thực hiện được phép loại bỏ cặp số trong mảng số nguyên

## I. Giải thích chi tiết:

### 1. Đầu vào:

Một mảng số nguyên có tên là nums.
Một số nguyên k.

### 2. Phép loại bỏ:

Mỗi lần thực hiện phép loại bỏ, chúng ta sẽ chọn hai số khác nhau từ mảng nums có tổng bằng k và loại bỏ chúng khỏi mảng.

### 3. Mục tiêu:

Tìm số lần tối đa chúng ta có thể thực hiện được phép loại bỏ cặp số như trên.

## II. Ví dụ:

### Ví dụ 1:

Mảng nums là [1, 2, 3, 4] và k là 5.
Có thể thực hiện phép loại bỏ 2 lần:
Lần 1: Loại bỏ số 1 và 4 vì 1 + 4 = 5.
Lần 2: Loại bỏ số 2 và 3 vì 2 + 3 = 5.
Không thể thực hiện thêm lần loại bỏ nào nữa vì mảng đã trống.
Vậy kết quả là 2.

### Ví dụ 2:

Mảng nums là [3, 1, 3, 4, 3] và k là 6.
Chỉ có thể thực hiện phép loại bỏ 1 lần:
Loại bỏ hai số 3 đầu tiên vì 3 + 3 = 6.
Không còn cặp số nào khác có tổng bằng 6 nên không thể loại bỏ thêm.
Vậy kết quả là 1.
