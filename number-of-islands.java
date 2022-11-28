class Solution {
    public int numIslands(char[][] grid) {
        int l = grid.length -1;
        int c = grid[0].length - 1;
        int n = 0;
        
        for(int i = 0; i <= l; i++) {
            for(int j = 0; j <= c; j++) {
                if(grid[i][j] == '1') {
                    n++;
                    depthFirstSearch(grid, i, j, l, c);
                }
            }
        }

        return n;
    }

        public void depthFirstSearch(char[][] grid, int rootX, int rootY, int l, int c){
        grid[rootX][rootY] = '0';
        if(rootX + 1 <= l){
            if(grid[rootX + 1][rootY] != '0'){
                depthFirstSearch(grid, rootX + 1, rootY, l, c);
            }

        }
        if(rootX - 1 >= 0){
            if(grid[rootX - 1][rootY] != '0'){
                depthFirstSearch(grid, rootX - 1, rootY, l, c);
            }
        }

        if(rootY + 1 <= c){
            if(grid[rootX][rootY + 1] != '0'){
                depthFirstSearch(grid, rootX, rootY  + 1, l, c);
            }
        }
        if(rootY - 1 >= 0){
            if(grid[rootX][rootY - 1] != '0'){
                depthFirstSearch(grid, rootX, rootY - 1, l, c);
            }
        }
    }
}
