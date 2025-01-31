class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int stop = nums.length - 1;

        while (start <= stop) {
            int mid = start + (stop - start)/2;
         if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else { //(nums[mid] > target) {
            stop = mid - 1;
    }
        }
        return -1;
    }
}
