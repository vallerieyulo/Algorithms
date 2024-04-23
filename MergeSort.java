import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] nums1 = { 4, 1, 3, 0,0,0 };
        int[] nums2 = { 5, 2, 6 };
        int[] nums3 = {};
        System.out.println("Array nums1 before: " + Arrays.toString(nums1));
        System.out.println("Array nums2 before: " + Arrays.toString(nums2));
        merge(nums1, nums1.length, nums2, nums2.length);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Array nums1count: " + nums1.length);
            nums1[i + nums2.length] = nums2[i];
            System.out.println("Array nums1 before: " + Arrays.toString(nums1));
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] < nums1[i]) {
                    int temp = 0;
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;

                }
            }
        }

        System.out.println("Merged and Sorted arrays: " + Arrays.toString(nums1));
    }
}
