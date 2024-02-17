public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = left + k;
        double maxSum = Double.NEGATIVE_INFINITY; 
        double currentSum = 0.0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        while (right < nums.length) {
            currentSum += nums[right];
            currentSum -= nums[left];

            maxSum = Math.max(maxSum, currentSum);

            left++;
            right++;
        }

        return maxSum / k;
    }

}
