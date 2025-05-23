// Time complexity - O(log n)
// Space complexity - O(1)
// DID you solve in leetcode - Yes
// Face any issues while solving - No
// Since, the minimum element will always be in the unsorted side, we are rejecting the sorted side of the array always.

class Solution {
    public int findMin(int[] nums) {
        int low =0, high = nums.length-1;
        if(nums == null || nums.length == 0) return -1;
        
        while(low <= high) {
            if(nums[low] <= nums[high]) return nums[low];
            int mid = low + (high-low)/2;
            if ((mid == 0 || nums[mid] < nums[mid-1]) &&  nums[mid] <nums[mid+1]) {
                return nums[mid];
            } else if(nums[low]<=nums[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return nums[low];
    }
}
