class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }
      
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i< nums.length; i++){
            if (map.containsKey(nums[i])){
               map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer,Integer>> frequencyList = new ArrayList<>(map.entrySet());

        frequencyList.sort((a,b)-> b.getValue() - a.getValue());

        for(int i=0 ; i< k; i++){
            result.add(frequencyList.get(i).getKey());
        }


     int[] intArray = result.stream()
                             .mapToInt(Integer::intValue)
                             .toArray();
                        
                        return intArray;
    }
}
