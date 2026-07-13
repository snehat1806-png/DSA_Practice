class Solution {
    public int search(int[] nums, int target) {
      return searchIndex(nums,target,0,nums.length-1);
    }
      public int searchIndex(int[] nums,int target,int low,int high){
        //Base Condition
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
           return mid;
        } 
        //for left sorted half
        if(nums[low]<=nums[mid]){
            if(nums[low]<=target&&target<nums[mid]){
               return searchIndex(nums,target,low,mid-1);
            }else{
               return searchIndex(nums,target,mid+1,high);
            }
        }
        //for right sorted array 
        else{
            if(target>nums[mid]&&target<=nums[high]){
             return searchIndex(nums,target,mid+1,high);
            }else{
           return searchIndex(nums,target,low,mid-1);
        }
       } 
      } 
}