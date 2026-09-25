class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right){
            int width=right-left;
            int water_height=width*(Math.min(height[left],height[right]));
            max=Math.max(max, water_height);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}