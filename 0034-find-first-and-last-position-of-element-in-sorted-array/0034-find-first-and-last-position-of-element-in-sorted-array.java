class Solution {
    public int firstocc(int[] arr,int k){
        int l=0,r=arr.length-1;
        int first=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
               first=mid;
               r=mid-1;
            }else if(arr[mid]>k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return first;
    }
    public int secondocc(int[] arr,int k){
        int l=0,r=arr.length-1;
        int second=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
               second=mid;
               l=mid+1;
            }else if(arr[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return second;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int first = firstocc(nums, target);
        
        if(first == -1) return new int [] {-1, -1};
        
        int last = secondocc(nums, target);

        return new int []{first, last};

    }
}