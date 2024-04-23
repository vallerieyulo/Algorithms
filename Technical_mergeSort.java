import java.util.Arrays;

public class Technical_mergeSort {

    public static void main(String[] args) {

        int[] nums1 = { 4, 1, 3, 2, 6, 5 };
        int[] nums2 = { 2, 6, 5 };
        int m = 3;
        int n = 3;

        System.out.println("merge arrays: " + Arrays.toString(nums1));
    //    nums1 = merge(nums1, m, nums2, n);
        sort(nums1, m, n);
    }

    // methods
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];

        }
        // System.out.println(Arrays.toString(nums1));
        return nums1;
    }

    public static void sort(int[] nums1, int m, int n) {

        for (int i = 0; i < m + n; i++) {
            for (int j = 0; j < m + n; j++) {
                if (nums1[i] < nums1[j]) {
                    int temp = 0;
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }

        }
        

        System.out.println("Sorted array: " + Arrays.toString(nums1));
    }

}
