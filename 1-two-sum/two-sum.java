class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int n=nums.length;
     for(int i=0;i<n;i++){
        int num=nums[i];
        int moreneeded=target-num;
        if(map.containsKey(moreneeded)){
            return new int[]{map.get(moreneeded),i};
        }
        map.put(num,i);
     }
    return new int[]{-1,-1};


    //     for(int i = 0; i < nums.length - 1; i++) {
    //         for(int j = i + 1; j < nums.length; j++) {
    //             if(nums[i] + nums[j] == target) {
    //                 return new int[] {i, j};
    //             }
    //         }
    //     }
    // return new int[] {};
       
    }
}