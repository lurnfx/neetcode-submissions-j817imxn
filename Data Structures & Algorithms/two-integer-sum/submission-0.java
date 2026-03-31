class Solution {
    public int[] twoSum(int[] nums, int target) {   // 7-3 = 4 4 exist
      HashMap<Integer, Integer> map = new HashMap<>();  
                  //7-4 = 3 exist  //matched restun the value index of the array\
      int[] result = new int[2];

      for(int i=0; i < nums.length; i++){
        if(map.containsKey(target-nums[i])){
           result[0] = map.get(target-nums[i]);
           result[1] = i;
           break;
        }
        map.put(nums[i], i);
      }
     return result;
    }
}
