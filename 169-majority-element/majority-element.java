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
    int size=0;
    for(int i=0;i<nums.length;i++){
        if(size==0){
          n=nums[i];  
        }
        size=size+((nums[i]==n)?1:-1);
    }
    return n;
    }
}