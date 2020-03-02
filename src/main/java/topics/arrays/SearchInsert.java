package topics.arrays;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {

        int hi = nums.length - 1;
        int lo = 0;

        while (lo <= hi) {
            int middle = (hi + lo) / 2;
            int num = nums[middle];
            if (num == target) {
                return middle;
            }
            if (num > target) {
                // search left
                hi = middle - 1;
            }
            if (num < target) {
                // search right
                lo = middle + 1;
            }
        }
        return lo;
    }
}
