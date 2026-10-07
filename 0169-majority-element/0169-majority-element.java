class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int res=0, maj=0;
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],1+hash.getOrDefault(nums[i],0));
            if(hash.get(nums[i])>maj){
                res=nums[i];
                maj=hash.get(nums[i]);
            }
        }
        return res;
    }
}