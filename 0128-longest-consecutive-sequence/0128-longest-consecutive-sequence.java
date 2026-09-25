class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max_con=0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr_num=num;
                int ls=1;
                while(set.contains(curr_num+1)){
                    curr_num+=1;
                    ls+=1;
                }
                max_con=Math.max(max_con, ls);
            }
        }
        return max_con;
    }
}