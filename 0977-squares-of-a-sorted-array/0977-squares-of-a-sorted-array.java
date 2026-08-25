class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=nums.length-1;
        int store;
        int[] result = new int[n];
        for(int i=n-1; i>=0; i--){
        
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                store=nums[l];
                l++;
            }
            else{
                store=nums[r];
                r--;
            }
            result[i] = store * store;
        }
        return result;
    }
}