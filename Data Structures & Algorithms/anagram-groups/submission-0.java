class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
       
        for(int i=0; i<strs.length; i++){
           if(visited[i]) continue;
          
           List<String> anagram = new ArrayList<>();
           anagram.add(strs[i]);
           visited[i] = true;
         
           for(int j=i+1; j<strs.length; j++)
           {
               if(!visited[j] && strs[i].length() == strs[j].length()){
                char[] firstStr = strs[i].toCharArray();
                char[] secoundStr = strs[j].toCharArray();
                Arrays.sort(firstStr);
                Arrays.sort(secoundStr);
                if(Arrays.equals(firstStr, secoundStr)){
                    anagram.add(strs[j]);
                    visited[j] = true;
                }
                
               }
           }
              result.add(anagram);
        }
        return result;
    }
}

