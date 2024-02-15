package Java;

public class MaxArea {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxArea(height);

        System.out.println("Diện tích thùng chứa nước tối đa là: " + maxArea);
    }
}