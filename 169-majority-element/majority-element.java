class Solution {
    public int majorityElement(int[] nums) {
    //    HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //       int count= map.getOrDefault(nums[i],0)+1;
    //       map.put(nums[i],count);
    //         if (count > nums.length / 2) {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    int n=0;
    int c=0;
    for(int i=0;i<nums.length;i++){
        if(c==0){
          n=nums[i];  
        }
        if(nums[i]==n){
        c++;
        }else{
            c--;
        }
    }
    return n;
    }
}