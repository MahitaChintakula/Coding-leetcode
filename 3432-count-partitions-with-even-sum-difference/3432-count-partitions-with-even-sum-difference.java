class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        int left=0;
        int right=0,count=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right=total-left;
             if((left%2)==(right%2)){
                 count++;
             }
        }
        return count;
    }
}