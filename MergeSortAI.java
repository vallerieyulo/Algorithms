import java.util.Arrays;

public class MergeSortAI {
    public static void main(String[] args) {

        int[] nums1 = { 5, 1, 3, 0, 0, 0 };
        int[] nums2 = { 2, 4, 6 };
        int m = 3;
        int n = 3;

        System.out.println("Array nums1 before: " + Arrays.toString(nums1));
        System.out.println("Array nums2 before: " + Arrays.toString(nums2));
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last index of nums1
        int j = n - 1; // Last index of 
        int k = m + n - 1; // Last index of merged array

        // Merge nums1 and nums2, starting from the end of the arrays
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
                System.out.println("Array nums1: " + Arrays.toString(nums1));

            } else {
                nums1[k--] = nums2[j--];
                System.out.println("Array nums1: " + Arrays.toString(nums1));
            }
        }

        // Copy any remaining elements from nums2 to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        System.out.println("Merged and Sorted arrays: " + Arrays.toString(nums1));
    }
}
