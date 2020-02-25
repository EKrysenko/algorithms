package topics.arrays;

public class RemoveElement {
    public static int removeElementBrutForce(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
