class Solution {
    public int[] sortArrayByParity(int[] nums) {
        return helper(nums,0,nums.length-1);
    //     int n=nums.length;
    //     int count=0;
    //  for(int i=0;i<n;i++){
    //     if(nums[i]%2==0){
    //         int temp=nums[i];
    //         nums[i]=nums[count];
    //         nums[count]=temp; 
    //         count++;      
    //     }
    //  }
    //  return nums;
    }
 public int[] helper(int[] nums,int left,int right){
    while(left<right){
        if(nums[left]%2!=0&&nums[right]%2==0){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
           left++;
        }
         if(nums[left]%2==0){
            left++;
        }
        if(nums[right]%2!=0){
            right--;
        }
    }
    return nums;
 }
}