class Solution {
    public int maximumProduct(int[] nums) {
        int mx1=Integer.MIN_VALUE;
        int mx2=Integer.MIN_VALUE;
        int mx3=Integer.MIN_VALUE;
        int mn1=Integer.MAX_VALUE;
        int mn2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx1){
                mx3=mx2;
                mx2=mx1;
                mx1=nums[i];
            }
            else if(nums[i]>mx2){
                mx3=mx2;
                mx2=nums[i];
            }
            else if(nums[i]>mx3){ 
                mx3=nums[i];
            }
            if(nums[i]<mn1){
                mn2=mn1;
                mn1=nums[i];
            }
            else if(nums[i]<mn2){
                mn2=nums[i];
            }
        }
        int max=mx1*mx2*mx3;
        int min=mn1*mn2*mx1;
        return Math.max(max,min);

    }
}