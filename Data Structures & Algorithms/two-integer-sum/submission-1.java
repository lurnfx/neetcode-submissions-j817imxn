class Solution {
    public int[] twoSum(int[] nums, int target) {  
     int[] sum = new int[2];
     HashMap<Integer, Integer> map = new HashMap<>();

     for(int i= 0; i< nums.length; i++){
        if(map.containsKey(target-nums[i])){
          int index =  map.get(target-nums[i]);
          sum[0] = index;
          sum[1] = i;
        }
      map.put(nums[i],i);
     }

     return sum;
      }
 }