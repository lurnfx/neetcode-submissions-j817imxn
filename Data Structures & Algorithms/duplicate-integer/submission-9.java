class Solution {
    public boolean hasDuplicate(int[] nums) {
     Set<Integer> setOfNumbers = new HashSet<>();
     for(int n : nums){
      if(setOfNumbers.contains(n)){
        return true;
       }
       setOfNumbers.add(n);
     }
     return false;
    }
}