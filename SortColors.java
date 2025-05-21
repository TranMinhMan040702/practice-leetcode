import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        Solution.sortColors(nums);
        System.out.println(Arrays.toString(nums)); // In kết quả
    }
}

class Solution {
    public static void sortColors(int[] nums) {
        int low = 0;
        int middle = 0;
        int hight = nums.length - 1;

        while (middle <= hight) {
            if (nums[middle] == 0) {
                swap(nums, middle, low);
                low++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                swap(nums, middle, hight);
                middle++;
                hight--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
