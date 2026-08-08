class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=max&&nums[i]<max){
                int smax=nums[i];
                for(int j=n-3;j>=0;j--){
                if(nums[j]!=smax&&nums[j]<smax){
                    return nums[j];
                }
                }
            }
        }
    return max;
    }
}