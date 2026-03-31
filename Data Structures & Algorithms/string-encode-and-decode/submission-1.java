class Solution {

    public String encode(List<String> strs) {
      StringBuilder builder = new StringBuilder();
        for(String value : strs){
            builder.append(value.length()).append("#").append(value);
        }
     return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        
        int i=0;

        while(i<str.length()){
             int j = i;

             while(str.charAt(j)!='#'){
                j++;
             } 

             int length = Integer.parseInt(str.substring(i, j));

             j++; //skip the #
              
              String value = str.substring(j, j+length);

              result.add(value);
              i = j+length;

        }

   
      return result;
    }
}
