class Solution {
    public int[] sortArray(int[] nums) {
     mergesort(nums,0,nums.length-1);
     return nums;
    }
    public void mergesort(int[] nums,int low,int high){
     if(low>=high){
        return;
     }
        int mid=low+(high-low)/2;
        mergesort(nums,low,mid);//for left sort
        mergesort(nums,mid+1,high);//for right sorting
        merge(nums,low,mid,high);
       }
       public void merge(int[] nums,int low,int mid,int high){
        int[] arr=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=high){
        if(nums[i]>nums[j]){
            arr[k]=nums[j];
            j++;
            k++;
        }else{
            arr[k]=nums[i];
            i++;
            k++;
        }
        }
        while(i<=mid){
            arr[k]=nums[i];
            i++;
            k++;
        }
        while(j<=high){
            arr[k]=nums[j];
            j++;
            k++;
        }
      for(int l=low;l<=high;l++){
        nums[l]=arr[l-low];
      }
    
       }
}