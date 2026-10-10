
import java.util.*;

class Solution {
    public long minSumSquareDiff(
            int[] nums1, int[] nums2, int k1, int k2) {

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        long totalOperations = (long) k1 + k2;

        // Calculate absolute differences
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            maxHeap.offer(diff);
        }

        // Reduce the largest difference each time
        while (totalOperations > 0) {
            int maxDiff = maxHeap.poll();

            if (maxDiff == 0) {
                return 0;
            }

            maxHeap.offer(maxDiff - 1);
            totalOperations--;
        }

        // Calculate the sum of squared differences
        long result = 0;

        while (!maxHeap.isEmpty()) {
            long diff = maxHeap.poll();
            result += diff * diff;
        }

        return result;
    }
}
