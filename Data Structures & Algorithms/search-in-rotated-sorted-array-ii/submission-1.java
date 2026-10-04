class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int st=0, end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return true;
            }
            //if dublicates at boundaries reduce search window
            if(nums[st]==nums[mid] && nums[mid]==nums[end]){
                st++;
                end--;
            }
            
            //left is sorted
            else if(nums[st]<=nums[mid]){
                if(nums[st]<=target && target<=nums[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            //right is sorted
            else{
                if(nums[mid]<=target && target<=nums[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}