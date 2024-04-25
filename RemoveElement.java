import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        removeElement(nums, val);

    }

    public static void removeElement(int[] nums, int val) {

        int[] expectedNums = new int[nums.length];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                expectedNums[index++] = nums[i];
            }   
            else {
                index++;
            }
        }

        System.out.println("Removed values: " + Arrays.toString(expectedNums));
    }
}
