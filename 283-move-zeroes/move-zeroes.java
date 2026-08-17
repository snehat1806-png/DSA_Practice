class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
        }
    }
    private void swap(int[] nums,int left ,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}