class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] secound = t.toCharArray();
   
   Arrays.sort(first);
   Arrays.sort(secound);

   return Arrays.equals(first, secound);

    }
}
