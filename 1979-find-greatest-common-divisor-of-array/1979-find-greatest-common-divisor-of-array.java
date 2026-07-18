class Solution {
    public int findGCD(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<mn){
        //         mn=nums[i];
        //     }
        //     else if(nums[i]>mx){
        //         mx=nums[i];
        //     }
        // }
        for (int i=0;i<nums.length;i++) {
            mn = Math.min(mn, nums[i]);
            mx = Math.max(mx, nums[i]);
        }
        while(mn!=0 && mx!=0){
            if(mn>mx){
                mn=mn%mx;
            }
            else{
                mx=mx%mn;
            }
        }
        if(mn!=0){
            return mn;
        }
        return mx;
    }
}