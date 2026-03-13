class Solution {
    public int[] numberGame(int[] nums) {
        //int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+2){
           if(nums[i]<nums[i+1]){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
           }
        }
        return nums;
    }
}