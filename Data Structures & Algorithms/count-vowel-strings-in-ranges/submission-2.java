class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int count = 0;
            for(int s=queries[i][0];s<=queries[i][1];s++){
                if((words[s].startsWith("a")||words[s].startsWith("e")||words[s].startsWith("i")||words[s].startsWith("o")||words[s].startsWith("u"))&&(words[s].endsWith("a")||words[s].endsWith("e")||words[s].endsWith("i")||words[s].endsWith("o")||words[s].endsWith("u"))){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}