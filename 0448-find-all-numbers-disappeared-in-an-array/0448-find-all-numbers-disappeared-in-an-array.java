class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        List<Integer> res=new ArrayList<>();
        for(int j=1;j<=nums.length;j++){
            if(!map.contains(j)){
                res.add(j);
            }
        }
        return res;
        //return new ArrayList<>(map);
    }
}