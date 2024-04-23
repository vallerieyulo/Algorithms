import java.util.Arrays;

public class removeElementAI {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.println("Modified Array: " + Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j]; // Replace nums[i] with the value at nums[j]
                j--; // Move j towards left
            } else {
                i++; // Move i towards right
            }
        }

        return j + 1; // j + 1 represents the number of elements not equal to val
    }
}
