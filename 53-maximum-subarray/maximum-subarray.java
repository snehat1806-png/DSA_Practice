class Solution {

    public int maxSubArray(int[] nums) {
          // Maximum sum
        long maxi = Long.MIN_VALUE; 
        
        // Current sum of subarray 
        long sum = 0; 
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            
            // Add current element to the sum
            sum += nums[i]; 
            
            // Update maxi if current sum is greater
            if (sum > maxi) {
                maxi = sum; 
            }
            
            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0; 
            }
        }
        
        // Return the maximum subarray sum found
        return (int) maxi;
    //    int max=Integer.MIN_VALUE;
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //         if(sum>max){
    //             max=sum;
    //         }
    //         if(sum<0){
    //             sum=0;
    //         }
    //     }
    //     return max;
    }
}