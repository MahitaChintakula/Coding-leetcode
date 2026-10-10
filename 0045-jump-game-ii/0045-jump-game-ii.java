class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jumps=0;
        int curr_end=0;
        int max=0;
        for(int i=0;i<n-1;i++){
            max=Math.max((i+nums[i]),max);
            if(i==curr_end){
                jumps++;
                curr_end=max;
            } 
        }
        return jumps;
    }
}