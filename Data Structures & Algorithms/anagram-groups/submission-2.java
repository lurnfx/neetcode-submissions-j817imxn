class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
           char[] inputStr = strs[i].toCharArray();
           Arrays.sort(inputStr);
           String sorted = String.valueOf(inputStr);
           map.computeIfAbsent(sorted, s-> new ArrayList<>()).add(strs[i]);
        }
      return new ArrayList<>(map.values());
    }
}
