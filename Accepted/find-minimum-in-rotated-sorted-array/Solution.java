class Solution {

    public int  binarySerch(int[] nums, int n){
       int ele = 0;
       int start = 0;
       int end = n-1;
       if(nums[0] < nums[n-1]) return nums[0];
       if(nums[0] > nums[n-1] && nums[n-1] < nums[n-2]) return nums[n-1];
       while(start <= end){
        int mid = start+(end-start)/2;
        if(mid != 0 && mid != n-1){
            if(nums[mid] < nums[mid+1] && nums[mid] < nums[mid-1]){
             return nums[mid];
            }else{
              if(nums[mid] > nums[end]) start = mid + 1;
              else end = mid ; 
              ele = nums[mid];
            }
        }
       }
         return ele; 
        }

    public int findMin(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return nums[0] < nums[1] ? nums[0] : nums[1];
        return binarySerch(nums, n);
    }
}