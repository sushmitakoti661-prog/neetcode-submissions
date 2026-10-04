class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int n=a.length, m=a[0].length;
        int st=0, end=n*m-1;
        while(st<=end){
            int mid=(end+st)/2;
            int midElement=a[mid/m][mid%m];
            if(midElement==target) return true;
            else if(midElement<target) st=mid+1;
            else end=mid-1;
        }
        return false;
    }
}
