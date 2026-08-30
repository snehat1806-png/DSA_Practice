class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
               int n = nums.length;

        // Used to remove duplicate quadruplets
        Set<List<Integer>> ansSet = new HashSet<>();

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                // Stores numbers we have already seen for this i, j
                Set<Long> hashSet = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long sum = (long) nums[i]
                             + nums[j]
                             + nums[k];

                    long fourth = (long) target - sum;

                    // Check if required fourth number was seen
                    if (hashSet.contains(fourth)) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);

                        Collections.sort(temp);

                        ansSet.add(temp);
                    }

                    // Add current number AFTER checking
                    hashSet.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(ansSet); 
    }
}