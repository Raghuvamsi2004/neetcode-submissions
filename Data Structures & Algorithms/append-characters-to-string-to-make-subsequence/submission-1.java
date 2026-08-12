class Solution {
    public int appendCharacters(String s, String t) {
        int n = t.length();
        
        int k = 0;
        for(int i=0;i<t.length();i++){
            boolean flag = false;
            for(int j=k;j<s.length();j++){
                if(t.charAt(i)==s.charAt(j)){
                    n--;
                    k = j+1;
                    flag = true;
                    break;
                }

            }
            if(!flag){
                break;
            }
        }
        return n;
    }
}