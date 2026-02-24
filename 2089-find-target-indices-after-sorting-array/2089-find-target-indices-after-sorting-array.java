class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ind=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ind.add(i);
            }
        }
        return ind;
    }
}