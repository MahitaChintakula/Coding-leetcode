class Solution {
    public int findDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])) return nums[i];
            map.add(nums[i]);
        }
        return 0;
    }
}