class Solution {
    public int maximumCount(int[] nums) {
         int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos++;
            }else if(nums[i]<0){
                neg++;
            }
        }
        int res=Math.max(pos,neg);
        return res;
        // int left=0,right=nums.length-1;
        // while(left<=right){
        //     int mid=(left+right)/2;
        //     if(nums[mid]>0){
        //         pos++;
        //         right=mid-1;
        //     }
        //     else if(nums[mid]<0){
        //         neg++;
        //         left=mid+1;
        //     }else{
        //         left++;
        //     }
        // }
        // int res=Math.max(pos,neg);
        // return res;
    }
}