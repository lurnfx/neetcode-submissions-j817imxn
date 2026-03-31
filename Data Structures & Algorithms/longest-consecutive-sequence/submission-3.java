class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        for(int i=0; i<nums.length; i++){ 
           set.add(nums[i]);   //2 20 4 10 3 5 
        }

       int max = 0;

       for (int num : nums) {

        if (!set.contains(num - 1)) {

            int current = num;
            int length = 1;

            while (set.contains(current + 1)) {
                current++;
                length++;
            }

            max = Math.max(max, length);
        }
    }
        return max;
    }
}

;