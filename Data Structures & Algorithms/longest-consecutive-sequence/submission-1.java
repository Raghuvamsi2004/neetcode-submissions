class Solution {
    public int longestConsecutive(int[] nums) {
        int[] numbers = Arrays.stream(nums).distinct().sorted().toArray();
        if(nums.length==0){
            return 0;
        }
        int longest = 1;
        int current = 1;

        for(int i=1;i<numbers.length;i++){
            
            if(numbers[i]==numbers[i-1]+1){
                current++;
            }
            else{
                current=1;
            }
            longest = Math.max(current,longest);

        }
        return longest;
    }
}
