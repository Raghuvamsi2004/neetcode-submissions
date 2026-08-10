class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int count = 0;
            for(int s=queries[i][0];s<=queries[i][1];s++){
                char start = words[s].charAt(0);
                char end = words[s].charAt(words[s].length()-1);
                if(isVowel(start)&&isVowel(end)){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }

    private boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}