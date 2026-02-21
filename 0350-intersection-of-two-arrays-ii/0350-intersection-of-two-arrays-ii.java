class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> set=new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             set.add(nums1[i]);
        //             break;
        //         }
        //     }
        // }
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for (int i=0;i<nums2.length;i++) { 
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) { 
                set.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            } 
        }
        int[] result = new int[set.size()];
        for (int k = 0; k < set.size(); k++) {
            result[k] = set.get(k);
        }
        return result;
    }
}