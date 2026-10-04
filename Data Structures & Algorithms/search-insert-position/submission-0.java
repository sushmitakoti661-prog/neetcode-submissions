class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int ans=n;
        int st=0, end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else st=mid+1;
        }
        return ans;
    }
}