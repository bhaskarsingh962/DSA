class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int n = nums.length;
        int end = n-1;
        if(n == 1) {
            if(nums[n-1] == target) return n-1;
            else return -1;
        } 
        
       while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            else if (nums[start] == target) return start;
            else if(nums[end] == target) return end;
        if (nums[start] <= nums[mid]) { 
            if (target >= nums[start] && target < nums[mid]) {
               end = mid - 1; 
            } else {
               start = mid + 1; 
            }
        } else { 
            if (target > nums[mid] && target <= nums[end]) {
               start = mid + 1;
        } else {
              end = mid - 1; 
        }
      }
    }
        return -1;
    }
}