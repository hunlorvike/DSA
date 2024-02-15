import { sort } from "array-helper"; 

class MaxOperation {
    public static maxOperations(nums: number[], k: number): number {
        sort(nums);
        let count = 0;
        let left = 0;
        let right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] === k) {
                left++;
                right--;
                count++;
            } else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static main(args: string[]): void {
        console.log(MaxOperation.maxOperations([1, 2, 3, 4, 5, 6], 5));
    }
}
