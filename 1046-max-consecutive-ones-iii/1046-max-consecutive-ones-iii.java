class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
    while (i < nums.length) {
        k -= nums[i++] == 1 ? 0 : 1;
        if (k < 0) 
            k += nums[j++] == 1 ? 0 : 1;
    }
    return i - j;
    }
}