class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int l = grid.length -1;
        int c = grid[0].length - 1;
        int maxVal = 0;
        int currVal = 0;

        for(int i = 0; i <= l; i++) {
            for(int j = 0; j <= c; j++) {
                if(grid[i][j] == 1) {
                    currVal = depthFirstSearch(grid, i, j, 0, l, c);
                    if(currVal > maxVal) maxVal = currVal;
                }
            }
        }

        return maxVal;
    }

        public int depthFirstSearch(int[][] grid, int rootX, int rootY, int n, int l, int c){
        n++;
        grid[rootX][rootY] = 0;
        if(rootX + 1 <= l){
            if(grid[rootX + 1][rootY] != 0){
                n = depthFirstSearch(grid, rootX + 1, rootY, n, l, c);
            }

        }
        if(rootX - 1 >= 0){
            if(grid[rootX - 1][rootY] != 0){
                n = depthFirstSearch(grid, rootX - 1, rootY, n, l, c);
            }
        }

        if(rootY + 1 <= c){
            if(grid[rootX][rootY + 1] != 0){
                n = depthFirstSearch(grid, rootX, rootY  + 1, n, l, c);
            }
        }
        if(rootY - 1 >= 0){
            if(grid[rootX][rootY - 1] != 0){
                n = depthFirstSearch(grid, rootX, rootY - 1, n, l, c);
            }
        }

        return n;
    }
}
