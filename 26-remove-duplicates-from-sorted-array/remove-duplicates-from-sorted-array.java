class Solution {
    public int removeDuplicates(int[] nums) {
        //optimal solution
        // int i=0;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[j]!=nums[i]){
        //         nums[i+1]=nums[j];
        //         i++;
        //     }
        // }
        //     return i+1;
        // if(nums.length==0){
        //     return 0;
        // }
        // int count=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //    nums[count]=nums[i];
        //     count++;
        //     }
        // }
        // return count;
        //brute approach
       HashSet<Integer> set=new LinkedHashSet<>();
        
       for(int num:nums){
        set.add(num);
       }
       int i=0;
       for(int num:set){
        nums[i]=num;
        i++;
       }
       return set.size();

    }
}