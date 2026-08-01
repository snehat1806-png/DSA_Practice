class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hh=new HashSet<>();
        for(int num:nums){
            if(hh.contains(num)){
                return true;
            }
            hh.add(num);
        }
        return false;
    }
}