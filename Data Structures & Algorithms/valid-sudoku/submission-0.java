class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] grids = new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            columns[i]=new HashSet<>();
            grids[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char d = board[i][j];
                if(d=='.'){
                    continue;
                }
                int b = (i/3)*3 + (j/3);

                if(rows[i].contains(d) || columns[j].contains(d)||grids[b].contains(d)){
                    return false;
                }

                rows[i].add(d);
                columns[j].add(d);
                grids[b].add(d);

            }
        }
        return true;
    }
}
