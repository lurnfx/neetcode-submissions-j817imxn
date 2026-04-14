class Solution {
    public int[] twoSum(int[] nums, int target) {  
     //create array to store the 2 indexes   
     int[] sum = new int[2];
     //create the mao to add the key as number and values as indexes
     HashMap<Integer, Integer> map = new HashMap<>();
     //for loop over the array to check the nums array elements
     for(int i= 0; i< nums.length; i++){
        //if containsKeyO in map checks the key which is number from array the logic is the targer- number which is available 
        if(map.containsKey(target-nums[i])){
            //if found get the we ll get the values whoch is index of he number in array (target-number)
          int index =  map.get(target-nums[i]);
          //place the indexes of the array
          sum[0] = index;
          sum[1] = i;
        }
        //if not found add the number plus the index
      map.put(nums[i],i);
     }

     return sum;
      }
 }