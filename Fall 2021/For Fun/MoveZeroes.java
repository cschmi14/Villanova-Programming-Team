import java.util.*;
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        List<Integer> output = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
            else {
                output.add(nums[i]);
            }
        }
        for (int i = 0; i < count; i++) {
            output.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)output.get(i);
        }
    }
}
