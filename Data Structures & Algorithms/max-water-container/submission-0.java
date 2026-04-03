class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right =heights.length-1;
        int maxArea =0;
      
        while(left<right){
            //logic behng area is calulate the width means bar;
           int width = right - left; 
           int min = Math.min(heights[left], heights[right]);
           int area = width * min;

           if(area >= maxArea){
             maxArea = area;
           } 

           if(heights[left] < heights[right]){
            left++;
           }
           else{
            right--;
           }
        }
        return maxArea;
        
    }
}
