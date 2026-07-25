class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> newList = new ArrayList<>();
        while(n!=0){
            int rem = n%10;
            newList.add(rem);
            n=n/10;
        }
        if(newList.size()<0){
            return 0;
        }
        Collections.sort(newList);
        int num=newList.size();
        return newList.get(num-1) * newList.get(num-2);
    }
}