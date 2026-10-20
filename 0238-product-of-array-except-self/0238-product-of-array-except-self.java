class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        int left=1;
        for(int i=0;i<n;i++){
            arr[i]=left*arr[i];
            left=left*nums[i];
        }
        int right=1;
        for(int j=n-1;j>=0;j--){
            arr[j]=right*arr[j];
            right=right*nums[j];
        }
        return arr;
    }
}