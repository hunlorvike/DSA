import java.util.Arrays;

public class MaxOperation {

	public static int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int count = 0;
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			if ((nums[left] + nums[right]) == k) {
				left++;
				right--;
				count++;
			} else if ((nums[left] + nums[right]) < k) {
				left++;
			} else {
				right--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(maxOperations(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
	}
}
