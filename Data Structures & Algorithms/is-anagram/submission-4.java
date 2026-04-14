class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()) {
         return false; 
         }  
     int[] freq  = new int[26];   
           // create the array to calculate the frequence 
          // logic here is calculate the logic for frequencies like for example if same charectors there then it will alway be zero 
         //freq contains zero every time 
        //if there are other char then it might be contain greater than or less than zero
     for(int i=0; i<s.length(); i++)
     { 
       freq[s.charAt(i)-'a']++;
       freq[t.charAt(i)-'a']--;
     }
 
     for(int i=0; i<freq.length; i++){
        if(freq[i]!=0){
            return false;
        }
     }
     return true;
    }
}
