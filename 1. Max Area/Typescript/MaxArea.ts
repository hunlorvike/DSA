function maxArea(height: number[]): number {
    let maxArea = 0;
    let left = 0;
    let right = height.length - 1;

    while (left < right) {
        const width = right - left;
        const currentHeight = Math.min(height[left], height[right]);
        const currentArea = width * currentHeight;

        maxArea = Math.max(maxArea, currentArea);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}

const heights: number[] = [1, 8, 6, 2, 5, 4, 8, 3, 7];
const result = maxArea(heights);

console.log("Diện tích thùng chứa nước tối đa là:", result);
