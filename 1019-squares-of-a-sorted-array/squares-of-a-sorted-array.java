class Solution {
    public int[] sortedSquares(int[] nums) {
      int n=nums.length;
      int left=0;
      int right=n-1;
      int[] res=new int[n];
      
      for(int i=n-1;i>=0;i--){
       if(Math.abs(nums[left])>Math.abs(nums[right])){
        res[i]=nums[i]*nums[i];
       }
       else{
        res[i]=nums[i]*nums[i];
       }
     Arrays.sort(res);
      }
      
    return res;


        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
    }
}