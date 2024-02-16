import java.util.Arrays;

public class Solution {
    public static int search(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0; // chỉ mục left
        int right = nums.length - 1; // chỉ mục right

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1; // Tìm kiếm bên trái của mảng
            }

        }
        return -1; // Không tìm thấy phần tử, trả về -1

    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 4, 5, 6, 2, 8, 9, 10 };
        int target = 7;
        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

    }
}
