class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m + n];

        for(int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }
        for(int i = 0; i < n; i++) {
            nums3[m + i] = nums2[i];
        }
        Arrays.sort(nums3);

        int total = nums3.length;

        if(total % 2 == 1) {
            return nums3[total / 2];
        }
        else {
            return (nums3[total / 2 - 1] + nums3[total / 2]) / 2.0;
        }
    }
}