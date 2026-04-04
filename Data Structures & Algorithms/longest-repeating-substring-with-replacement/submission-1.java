class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int left =0;
        int max =0;
        int maxlength =0;
        
        for(int right=0; right<s.length(); right++){
           freq[(s.charAt(right))-'A']++;// check char then make ++ mean 1   // X
              
           max = Math.max(max,  freq[(s.charAt(right))-'A']);       //1
           //if window - maxfrequncy > k 
           //
           while((right-left+1) - max > k){    // 1-0+1   2 -1 = 1 > 2 
              freq[(s.charAt(left))-'A']--; // make it frequnecy count less
              left++;
           }

          maxlength = Math.max(maxlength, right-left+1);

        }

        return maxlength;

    }



}
