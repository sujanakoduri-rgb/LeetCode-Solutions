
class Solution {
    public long minSumSquareDiff(
            int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        long total = 0;
        for (int d : diff) {
            total += d;
        }

        // If all differences can become zero
        if (k >= total) {
            return 0;
        }

        // Find the smallest target such that
        // reducing all differences to target uses <= k ops.
        int left = 0, right = max;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int target = left;
        long used = 0;
        long result = 0;

        for (int d : diff) {
            int reduced = Math.min(d, target);
            used += d - reduced;
            result += (long) reduced * reduced;
        }

        // Use remaining operations to reduce some
        // target differences by one more.
        long remaining = k - used;

        result -= remaining * (2L * target - 1);

        return result;
    }
}
