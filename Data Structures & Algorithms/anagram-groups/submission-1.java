class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
     HashMap<String, List<String>> map = new HashMap<>();

     for(int i=0; i<strs.length; i++){
        char[] sort =  strs[i].toCharArray();
        Arrays.sort(sort);
        String str = String.valueOf(sort);
        map.computeIfAbsent(str, s -> new ArrayList<>()).add(strs[i]);
     }

   return new ArrayList(map.values());

    }
}

