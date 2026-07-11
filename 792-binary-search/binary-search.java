class Solution {
    public int search(int[] nums, int target) {
        //using recursion 
        return search(nums,target,0,nums.length-1);
    //    int left=0;
    //    int right=nums.length-1;
    //    while(left<=right){
    //     int mid=left+(right-left)/2;
    //     if(nums[mid]==target){
    //         return mid;
    //     }else if(nums[mid]>target){
    //         right=mid-1;
    //     }else{
    //         left=mid+1;
    //     }
    //    } 
    //    return -1;
    }
    public int search(int []nums,int target,int left,int right){
        while(left>right){
           return -1; 
        }
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return search(nums,target,mid+1,right);
        }else{
            return search(nums,target,left,mid-1);
        }
    }
}