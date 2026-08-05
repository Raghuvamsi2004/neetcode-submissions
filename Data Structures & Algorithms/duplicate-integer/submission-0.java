class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        for(int num:nums){
            for(int i:nums){
                if(num==i){
                    count++;
                }
            }
        }
        if(count==nums.length){
            return false;
        }
        else{
            return true;
        }
    }
}