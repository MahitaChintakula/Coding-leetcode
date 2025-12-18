class Solution {
    public int thirdMax(int[] nums) {
        long f=Long.MIN_VALUE,s=Long.MIN_VALUE,t=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(f<nums[i]){
                t=s;
                s=f;
                f=nums[i];
            }
            else if(s<nums[i] && f!=nums[i]){
                t=s;
                s=nums[i];
            }
            else{
                if(t<nums[i] && nums[i]!=f && nums[i]!=s){
                    t=nums[i];
                }
            }
        }
        if(t!=Long.MIN_VALUE){
            return (int)t;
        }
        return (int)f;
    }
}