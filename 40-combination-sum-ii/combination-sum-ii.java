class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, 0, target,new ArrayList<>(), result);
        return result;
    }
    void backtrack(int[] nums, int index, int sum, int target, List<Integer> current,List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            // Skip duplicate at the same level
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            backtrack(
                nums,
                i + 1,
                sum + nums[i],
                target,
                current,
                result
            );
            current.remove(current.size() - 1);
        }
    }
}