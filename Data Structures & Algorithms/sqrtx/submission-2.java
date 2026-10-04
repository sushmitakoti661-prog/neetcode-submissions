class Solution {
    public int mySqrt(int x) {
        int st=0, end=x;
        int ans=-1;
        if(x==0) return 0;
        while(st<=end){
            int mid=(st+end)/2;
            long sqr=(long)mid*mid;
            if(sqr==x) return mid;

            else if(sqr<x){
                ans=mid;
                st=mid+1;
            }
            else end=mid-1;
        }
        return ans;
    }
}