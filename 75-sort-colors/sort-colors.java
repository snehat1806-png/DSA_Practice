class Solution {
    public void sortColors(int[] nums) {
        int max=nums[0];
       for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
       } 
       int[] count=new int[max+1];
       for(int i=0;i<=max;i++){
        count[i]=0;
       }
       for(int i=0;i<nums.length;i++){
          count[nums[i]]++;
       }
       int index=0;
       for(int value=0;value<=max;value++){
         while (count[value] > 0) {
            nums[index] = value;
            index++;
            count[value]--;
        }
       }
    }
}