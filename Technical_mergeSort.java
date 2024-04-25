import java.util.Arrays;

public class Technical_mergeSort {

    public static void main(String[] args) {

        int[] nums1 = { 4, 1, 3, 2, 7, 5 };
        int[] nums2 = { 9, 6, 8 };
        int m = nums1.length;
        int n = nums2.length;

        System.out.println("merge arrays: " + Arrays.toString(nums1));
        int[] result = merge(nums1, m, nums2, n);
        
        System.out.println("sort arrays: " + Arrays.toString(nums1));
        sort(result, m, n);
    }

    // methods
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = new int[m + n];

        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            nums3[j + m] = nums2[j];
        }

        return nums3;
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
