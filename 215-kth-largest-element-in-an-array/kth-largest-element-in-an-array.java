class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;   // Index of kth largest in sorted array
        return quickSelect(nums, 0, nums.length - 1, target);
    }
    private int quickSelect(int[] nums, int low, int high, int target) {
        if (low >= high) {
            return nums[low];
        }
        int pivotIndex = partition(nums, low, high);
        if (pivotIndex == target) {
            return nums[pivotIndex];
        } else if (pivotIndex > target) {
            return quickSelect(nums, low, pivotIndex - 1, target);
        } else {
            return quickSelect(nums, pivotIndex + 1, high, target);
        }
    }
    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (nums[j] <pivot) {
                swap(nums, i, j);
                i++;
            }
        }
       swap(nums, i, high);
        return i;
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}