import java.util.Arrays;

public class mergeArray {

    public static void main(String[] args){

        int[] nums1 = {1,2,3};
        int[] nums2 = {6,4,5};
        
        int[] nums3 = merge(nums1, nums2);       
        System.out.println("Merged array: " + Arrays.toString(nums3));
       
    }

    //method
    public static int[] merge(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m+n];

        for (int i=0; i < m; i++){
            nums3[i] = nums1[i];
        }
        for (int i=0; i < n; i++){
            nums3[i+m] = nums2[i];
        }
        return nums3;
        }

}
