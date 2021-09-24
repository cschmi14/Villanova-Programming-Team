import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int[] output = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = Arrays.binarySearch(nums, target - nums[i]);
            if (index >= 0) {
                if (index == i) {
                    for (int j = index + 1; j < nums.length; j++) {
                        if (nums[index] == nums[j]) {
                            output[0] = nums[index];
                            output[1] = nums[j];
                            break;
                        }
                    }
                }
                else {
                    output[0] = nums[i];
                    output[1] = nums[index];
                    break;
                }
            }
        }
        for (int i = 0; i < copy.length; i++) {
                if (copy[i] == output[0]) {
                    output[0] = i;
                    break;
                }
        }
        for (int i = 0; i < copy.length; i++) {
                if (i != output[0] && copy[i] == output[1]) {
                    output[1] = i;
                    break;
                }
        }
        return output;
    }
}