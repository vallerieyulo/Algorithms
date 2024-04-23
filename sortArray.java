import java.util.Arrays;

public class sortArray {

    public static void main(String[] args) {

        int[] nums1 = { 2, 4, 1,8,10 };
        int[] nums2 = { 3, 6, 5,9,7 };
        int[] nums3 = sort(nums1, nums2);
        System.out.println("Sorted array: " + Arrays.toString(nums3));
    }

    // method

    public static int[] sort(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
            
        }


        while (i < nums1.length){
            nums3[k++] = nums1[i++];
            System.out.println(Arrays.toString(nums3));
        }
        while (j < nums2.length){
            nums3[k++] = nums2[j++];
            System.out.println(Arrays.toString(nums3));
        }

        return nums3;
    }

}
