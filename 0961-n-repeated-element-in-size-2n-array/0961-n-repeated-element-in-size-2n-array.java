class Solution {
    public int repeatedNTimes(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else{
        //        map.put(nums[i],1);
        //     }
        // }
        // int max=0;
        // int ans=-1;
        // for(int key : map.keySet()){
        //     if (map.get(key) > max) {
        //         max = map.get(key);
        //         ans = key;
        //     }
        // }
        // return ans;
        HashSet<Integer> map=new HashSet<>();
        for(int num : nums){
            if(map.contains(num)){
                return num;
            }
            map.add(num);
        }
        return -1;
    }
}