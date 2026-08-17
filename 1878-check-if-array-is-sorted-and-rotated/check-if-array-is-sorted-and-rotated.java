class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int k=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
             count++;
             k=i+1;

            }          
        }
        if(count>1){
            return false;
        }
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
        
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public void reverse(int []nums,int left,int right){
        while(left<right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
    }
    }
}