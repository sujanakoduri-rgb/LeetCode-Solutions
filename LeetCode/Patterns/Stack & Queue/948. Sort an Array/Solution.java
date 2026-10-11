class Solution {
    public int[] sortArray(int[] nums) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int[] res = new int[nums.length];
        int j=0;
        while(!pq.isEmpty()){
            res[j] = pq.poll();
            j++;
        }
        return res;
    }
}