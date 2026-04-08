class Solution {
    public String minWindow(String s, String t) {
        char[] charArray = t.toCharArray();
        int[] need = new int[128]; //any charectar to save acsii number
        int left =0;
        int count = t.length();
         int minLen = Integer.MAX_VALUE;
    int start = 0;

        for(char c : charArray){
            need[c]++;
        }

          for (int right = 0; right < s.length(); right++) {

        // if this char is needed
        if (need[s.charAt(right)] > 0) {
            count--;
        }

        need[s.charAt(right)]--;

        // window is valid
        while (count == 0) {

            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                start = left;
            }

            need[s.charAt(left)]++;

            if (need[s.charAt(left)] > 0) {
                count++;
            }

            left++;
        }
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }
}
