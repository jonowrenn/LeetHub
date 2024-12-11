// array[] nums 
        // move all 0's to end of array nums 
        // maintain order 
        // must be done without making a copy of the array 
        //for loop to iterate through nums array to find 0s
        // method to get length and put 0s to end of array length 
        // somewhere to put 0s or algo to use to temp hold them ie quick sort 
        // use two pointers to swap non zeros left and zeros right
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right]; 
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}