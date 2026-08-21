class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Put all numbers into the set
        for (int num : nums) {
            set.add(num);
        }

        // Start from 1 and find the first missing positive
        int i = 1;

        while (set.contains(i)) {
            i++;
        }

        return i;
    }
}