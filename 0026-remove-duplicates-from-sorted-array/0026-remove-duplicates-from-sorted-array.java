class Solution {
    public int removeDuplicates(int[] nums) {
    //   int rd=0; i=0
    //   for(int i=1;i<nums.length;i++)  {j=2
    //     if(nums[rd]!=nums[i]){ 1!=2
    //         rd++; i=1
    //         nums[rd]=nums[i];
    //     }
    //   }
    //   return rd+1;
    int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]){
                continue;
            }
            else{
                nums[i]=nums[j];
                i++;  
            }
        }
        return i;
    }
}