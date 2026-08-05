class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        String newS = "";
        String newT = "";
        for(char i:arr){
            newS+=i;
        }
        for(char i:arr1){
            newT+=i;
        }
        if(newS.equals(newT)){
            return true;
        }
        else{
            return false;
        }
    }
}
