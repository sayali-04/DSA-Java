
package Arrays;

public class MergeTwoSorted_Array {

    public static void mergetwosorted(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                nums3[index++] = nums1[left++];
            } else {
                nums3[index++] = nums2[right++];
            }
        }

        while (left < m) {
            nums3[index++] = nums1[left++];
        }

        while (right < n) {
            nums3[index++] = nums2[right++];
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergetwosorted(nums1, 3, nums2, 3);

        System.out.println(java.util.Arrays.toString(nums1));
    }
}
