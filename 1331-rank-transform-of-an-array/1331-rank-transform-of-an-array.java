class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] newarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        Arrays.sort(newarr);
        HashMap<Integer, Integer> map=new HashMap<>();
        int r=1;
        for(int n : newarr){
            if(!map.containsKey(n)){
                map.put(n,r);
                r++;
            }
        }
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=map.get(arr[i]);
        }
        return a;
    }
}